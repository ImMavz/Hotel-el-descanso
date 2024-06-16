import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Login");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        
        frame.setVisible(true);
    }

    public static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Iniciar sesión");
        loginButton.setBounds(10, 80, 150, 25);
        panel.add(loginButton);

        // Acción del botón de inicio de sesión
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                char[] password = passwordText.getPassword();
                // Aquí puedes agregar la lógica de verificación del usuario y contraseña
                System.out.println("Usuario: " + username + ", Contraseña: " + new String(password));
            }
        });
    }
}
