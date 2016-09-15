package mx.com.edcore.util;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mailer {
        String outPutMail ;
        String password;
        String servidorSMTP = "mail.edcore.com.mx";
        String port = "26";
        String mailReceptor;
        String subject;
        String cuerpo;
        //metodo que recibe y envia el email
        public Mailer(String outPutMail, String password, String mailReceptor, String subject, String cuerpo) {
            this.outPutMail = outPutMail;
            this.password = password;
            this.mailReceptor = mailReceptor;
            this.subject = subject;
            this.cuerpo = cuerpo;
            //fin try-catch
        }//fin metodo enviaEmail
        public String send(){
            Properties props = new Properties();//propiedades a agragar
            props.put("mail.smtp.user", this.outPutMail);//correo origen
            props.put("mail.smtp.host", servidorSMTP);//tipo de servidor
            props.put("mail.smtp.port", port);//puesto de salida
            props.put("mail.smtp.starttls.enable", "false");//inicializar el servidor
            props.put("mail.smtp.auth", "true");//autentificacion
            props.put("mail.transport.protocol", "smtp");
            // CONFIGURACIÓN PARA GMAIL UTILIZANDO SSL
            //props.put("mail.smtp.starttls.enable", "true");
            //props.put("mail.smtp.socketFactory.port", port);
            //props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
            //props.put("mail.smtp.socketFactory.fallback", "false");
            SecurityManager security = System.getSecurityManager();
            try {
                Authenticator auth = new autentificadorSMTP();//autentificar el correo
                Session session = Session.getInstance(props, auth);//se inica una session
                // session.setDebug(true);
                MimeMessage msg = new MimeMessage(session);//se crea un objeto donde ira la estructura del correo
                msg.setText(this.cuerpo, "utf-8", "html");//seteo el cuertpo del mensaje
                
                msg.setSubject(this.subject);//setea asusto (opcional)
                msg.setFrom(new InternetAddress(this.outPutMail));//agrega la la propiedad del correo origen
                msg.addRecipient(Message.RecipientType.TO, new InternetAddress(this.mailReceptor));//agrega el destinatario
                Transport.send(msg);//envia el mensaje
               return "CORE0000";//alerta de que mensaje fue enviado correctamente
            } catch (Exception mex) {//en caso de que ocurra un error se crea una excepcion
                return "CORE0008";//muestra con cuadro de dialogo un mensaje que correo no fue enviado
            }
        }
        private class autentificadorSMTP extends javax.mail.Authenticator {
            @Override
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(outPutMail, password);//autentifica tanto el correo como la contraseña
            }
        }
}