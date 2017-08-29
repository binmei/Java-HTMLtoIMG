import java.awt.Dimension;
import gui.ava.html.image.generator.HtmlImageGenerator;

public class Test {

    public static void main(String[] args) {
        HtmlImageGenerator imageGenerator = new HtmlImageGenerator(); 
        imageGenerator.loadHtml("<table id=\"EmailWrapper\" style=\"max-width: 400px; width: 400px; font-family: arial; font-size: 13.5pt;\" align=\"center\">\r\n" + 
                "<tbody>\r\n" + 
                "<tr>\r\n" + 
                "<td>\r\n" + 
                "<table style=\"max-width: 580px; border-collapse: collapse;\" align=\"center\">\r\n" + 
                "<tbody>\r\n" + 
                "<tr>\r\n" + 
                "<td>\r\n" + 
                "<table style=\"max-width: 580px; width: 100%; height: 100%;\">\r\n" + 
                "<tbody>\r\n" + 
                "<tr style=\"width: 580px; height: 100px;\">\r\n" + 
                "<img style=\"align: baseline;\" title=\"\" src=\"http://support.theplatform.com/sn_img/cts-logo-stacked-580x100.png\" alt=\"Comcast Technology Solutions\" width=\"580\" height=\"100\" align=\"bottom\"/>\r\n" + 
                "</tr>\r\n" + 
                "</tbody>\r\n" + 
                "</table>\r\n" + 
                "</td>\r\n" + 
                "</tr>\r\n" + 
                "</tbody>\r\n" + 
                "</table>\r\n" + 
                "<table style=\"table-layout: fixed; max-width: 580px; border-top: 4px solid #0088cf; border-collapse: collapse; padding-bottom: 10px; padding-top: 10px;\" align=\"center\">\r\n" + 
                "<tbody>\r\n" + 
                "<tr>\r\n" + 
                "<td>\r\n" + 
                "<table style=\"table-layout: fixed; width: 100%; height: 100%; padding-top: 10px; padding-left: 8; padding-right: 8;\" cellpadding=\"0\">\r\n" + 
                "<tbody>\r\n" + 
                "<tr style=\"padding-top: 10px;\" align=\"left\">\r\n" + 
                "<td>\r\n" + 
                "<p style=\"font-size: 14pt; font-family: arial; color: #0088cf; font-weight: bold; margin-top: 10px; margin-bottom: 3px;\">Dear Customer:</p>\r\n" + 
                "<p style=\"font-size: 12pt; font-family: arial;\">We will perform Software maintenance on the  Service in our US data centers.</p>\r\n" + 
                "</td>\r\n" + 
                "</tr>\r\n" + 
                "<tr align=\"left\">\r\n" + 
                "<td>&nbsp;</td>\r\n" + 
                "</tr>\r\n" + 
                "</tbody>\r\n" + 
                "</table>\r\n" + 
                "<table style=\"table-layout: fixed; width: 100%; height: 100%; padding-top: 10px; padding-left: 8; padding-right: 8;\" cellpadding=\"0\">\r\n" + 
                "<tbody>\r\n" + 
                "<tr style=\"padding-top: 10px;\" align=\"left\">\r\n" + 
                "<td>\r\n" + 
                "<p style=\"font-size: 12pt; color: #0088cf; font-family: arial; font-weight: bold;\">Schedule</p>\r\n" + 
                "</td>\r\n" + 
                "</tr>\r\n" + 
                "<tr align=\"left\">\r\n" + 
                "<td>\r\n" + 
                "<table style=\"table-layout: fixed; width: 100%; height: 100%; padding-left: 8px;\">\r\n" + 
                "<tbody>\r\n" + 
                "<tr>\r\n" + 
                "<td style=\"width: 30%;\">\r\n" + 
                "<p style=\"font-weight: bold; font-size: 11pt; color: #505050;\">Maintenance Begins:</p>\r\n" + 
                "</td>\r\n" + 
                "<td style=\"width: 70%;\">\r\n" + 
                "<p style=\"font-family: arial; font-size: 10pt; font-style: italic;\">2017-08-28 16:29:43 PDT</p>\r\n" + 
                "</td>\r\n" + 
                "</tr>\r\n" + 
                "<tr>\r\n" + 
                "<td style=\"width: 30%;\">\r\n" + 
                "<p style=\"font-weight: bold; font-size: 11pt; color: #505050;\">Maintenance Ends:</p>\r\n" + 
                "</td>\r\n" + 
                "<td style=\"width: 70%;\">\r\n" + 
                "<p style=\"font-family: arial; font-size: 10pt; font-style: italic;\">2017-08-29 16:29:46 PDT</p>\r\n" + 
                "</td>\r\n" + 
                "</tr>\r\n" + 
                "</tbody>\r\n" + 
                "</table>\r\n" + 
                "</td>\r\n" + 
                "</tr>\r\n" + 
                "</tbody>\r\n" + 
                "</table>\r\n" + 
                "<table style=\"table-layout: fixed; width: 100%; height: 100%; padding-left: 8; padding-right: 8;\" cellpadding=\"0\">\r\n" + 
                "<tbody>\r\n" + 
                "<tr style=\"padding-top: 10px; margin-bottom: 4px;\" align=\"left\">\r\n" + 
                "<td>\r\n" + 
                "<p style=\"font-size: 13pt; font-family: arial; color: #0088cf; font-weight: bold;\"><br />Impact</p>\r\n" + 
                "</td>\r\n" + 
                "</tr>\r\n" + 
                "<tr align=\"left\">\r\n" + 
                "<td>\r\n" + 
                "<p style=\"font-family: arial; font-size: 12pt;\">During maintenance, Read and Write and Read Only service may be affected.</p>\r\n" + 
                "<p style=\"font-family: arial; font-size: 12pt;\"></p><p>Generating a html doc to test maintenance notification's html 2 image java app, please ignore.&nbsp;</p><p></p>\r\n" + 
                "<p style=\"font-family: arial; font-size: 12pt;\">If you have any questions or concerns regarding this maintenance window, please do not hesitate to contact our 24-hour support team.</p>\r\n" + 
                "<p style=\"font-family: arial; font-size: 12pt; margin-bottom: 4px;\">Best Regards,</p>\r\n" + 
                "<p style=\"font-family: arial; font-size: 12pt; margin-top: 0px;\">Comcast Technology Solutions</p>\r\n" + 
                "</td>\r\n" + 
                "</tr>\r\n" + 
                "</tbody>\r\n" + 
                "</table>\r\n" + 
                "<table style=\"table-layout: fixed; width: 100%; height: 100%; padding: 10px 8 10px 8;\" cellpadding=\"0\">\r\n" + 
                "<tbody>\r\n" + 
                "<tr style=\"padding-top: 10px;\" align=\"left\">\r\n" + 
                "<td>\r\n" + 
                "<p style=\"font-size: 12pt; font-family: arial; color: #0088cf; font-weight: bold;\"><br />For More Information</p>\r\n" + 
                "</td>\r\n" + 
                "</tr>\r\n" + 
                "<tr align=\"left\">\r\n" + 
                "<td>\r\n" + 
                "<table style=\"table-layout: fixed; width: 100%; height: 100%; padding-left: 8px;\">\r\n" + 
                "<tbody>\r\n" + 
                "<tr>\r\n" + 
                "<td style=\"width: 30%;\">\r\n" + 
                "<p style=\"color: #505050; font-weight: bold; font-size: 10pt;\">Web site:</p>\r\n" + 
                "</td>\r\n" + 
                "<td style=\"width: 70%;\"><a style=\"font-size: 10pt;\" href=\"http://support.theplatform.com\">https://support.theplatform.com</a></td>\r\n" + 
                "</tr>\r\n" + 
                "<tr>\r\n" + 
                "<td style=\"width: 30%;\">\r\n" + 
                "<p style=\"color: #505050; font-weight: bold; font-size: 10pt;\">Email:</p>\r\n" + 
                "</td>\r\n" + 
                "<td style=\"width: 70%;\"><a style=\"font-size: 10pt;\" href=\"mailto:support@theplatform.com\">support@theplatform.com</a></td>\r\n" + 
                "</tr>\r\n" + 
                "<tr>\r\n" + 
                "<td style=\"width: 30%;\">\r\n" + 
                "<p style=\"color: #505050; font-weight: bold; font-size: 10pt;\">Telephone:</p>\r\n" + 
                "</td>\r\n" + 
                "<td style=\"width: 70%;\">\r\n" + 
                "<p style=\"font-size: 10pt;\">866-405-2993 toll-free in the United States</p>\r\n" + 
                "</td>\r\n" + 
                "</tr>\r\n" + 
                "<tr>\r\n" + 
                "<td style=\"width: 30%;\">&nbsp;</td>\r\n" + 
                "<td style=\"width: 70%;\">\r\n" + 
                "<p style=\"font-size: 10pt;\">+1-206-436-7915 outside the United States</p>\r\n" + 
                "</td>\r\n" + 
                "</tr>\r\n" + 
                "</tbody>\r\n" + 
                "</table>\r\n" + 
                "</td>\r\n" + 
                "</tr>\r\n" + 
                "</tbody>\r\n" + 
                "</table>\r\n" + 
                "</td>\r\n" + 
                "</tr>\r\n" + 
                "</tbody>\r\n" + 
                "</table>\r\n" + 
                "<table style=\"max-width: 580px; width: 100%; padding-top: 6px; border-top: 4px solid #0088cf; border-collapse: collapse;\" cellpadding=\"0\" align=\"center\">\r\n" + 
                "<tbody>\r\n" + 
                "<tr>\r\n" + 
                "<td>\r\n" + 
                "<table style=\"max-width: 580px; width: 100%; height: auto; font-size: 10pt;\">\r\n" + 
                "<tbody>\r\n" + 
                "<tr align=\"center\">\r\n" + 
                "<td>\r\n" + 
                "<p style=\"padding: 0px; margin: 0px; font-family: arial;\">Comcast Technology Solutions</p>\r\n" + 
                "<p style=\"padding: 0px; margin: 0px; font-family: arial;\">1000 2nd Ave.</p>\r\n" + 
                "<p style=\"padding: 0px; margin: 0px; font-family: arial;\">Seattle, WA 98104</p>\r\n" + 
                "<p style=\"padding: 0px; margin: 0px; font-family: arial;\">U.S.A.</p>\r\n" + 
                "</td>\r\n" + 
                "</tr>\r\n" + 
                "</tbody>\r\n" + 
                "</table>\r\n" + 
                "</td>\r\n" + 
                "</tr>\r\n" + 
                "</tbody>\r\n" + 
                "</table>\r\n" + 
                "</td>\r\n" + 
                "</tr>\r\n" + 
                "</tbody>\r\n" + 
                "</table>");
        imageGenerator.saveAsImage("hello-world3.png"); 

        System.out.println(imageGenerator.getSize());
    }

}
