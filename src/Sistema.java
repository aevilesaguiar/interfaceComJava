import javax.swing.*;
//importando classes Jmenu,jmenuBar e jMenuItem para definir o menu
//importando classe Textarea
import javax.swing.JTextArea;
//importantdo classe jlabel inserindo um texto dentro de outro componente
import  javax.swing.JLabel;
//importando a classe JCheckBox
import javax.swing.JCheckBox;
//importando JOptionPane
import javax.swing.JOptionPane;
//importando a classe Jtext
import javax.swing.JTextField;
//importando a classe bUTTON
import javax.swing.JRadioButton;


public class Sistema {

    public static void main(String[] args) {
        //instanciando o componente
        JFrame frame = new JFrame("Meu Frame!");
        //definindo algumas configurações do componente
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,400);
        frame.setLayout(null);

        //chamando o método showMessageDialog
        JOptionPane.showMessageDialog(null,"Olá , Usuário! \n Clique em ok e preencha o formulário");

        //Instanciando o componente
        JTextField textField = new JTextField();
        //Definindo o posicionamento e o tamanho do componente
        textField.setBounds(20,90,360,40);

        //instanciando o componente
        JLabel label = new JLabel("Escreva um comentário:", JLabel.LEFT);

        //Definindo o posicionamento e tamanho do componente
        label.setBounds(20,60,250,30);



        //instanciando o componente
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem menuItem = new JMenuItem("Olá");
        JMenuItem menuItem2 = new JMenuItem("Olá2");



        //instanciando o componente
        JLabel label2 = new JLabel("Sugestao:", JLabel.LEFT);

        //Definindo o posicionamento e tamanho do componente
        label2.setBounds(20,150,300,30);
        //adicionando TextArea
        //instanciando o componente
        JTextArea textArea=new JTextArea();
        textArea.setBounds(20,180,360,100);

        //INSTANCIANDO O COMPONENTE
        JCheckBox checkBox = new JCheckBox("Aceita receber sugestões");
        //definindo o posicionamento
        checkBox.setBounds(20,250,360,40);

        JButton button=new JButton("ENVIAR");
        button.setBounds(20,280,360,40);


        //adicionando o textArea
        frame.add(textArea);


        //adicionando o menuItem no menu
        //e o menu no menuBar
        menu.add(menuItem);
        menu.add(menuItem2);
        menuBar.add(menu);

        //adicionando o componente no JFRAME
        frame.add(checkBox);

        //adicionando o JLabel no JFrame
        frame.add(label);
        //adicionando o JLabel no JFrame
        frame.add(label2);

        //adicionando o componente no JFrame
        frame.setJMenuBar(menuBar);

        //adicionando o componente no JFrame
        frame.add(textField);
        //adicionando o componente na JFRAME
        frame.add(button);

        frame.setVisible(true);
    }

}
