import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Salario extends JDialog {
    private JPanel Main;
    private JTextField txtCode;
    private JTextField txtNames;
    private JTextField txtHours;
    private JTextField txtValue;
    private JTextField txtRetention;
    private JButton calcularButton;
    private JButton salirButton;
    private JButton borrarButton;

    public Salario(JFrame parent) {
        super(parent);
        setTitle("Calcular Salario");
        setContentPane(Main);
        setMinimumSize(new Dimension(450, 474));
        setModal(true);
        setLocationRelativeTo(parent);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Codigo miCodigo = new Codigo();
                Nombres miNombre = new Nombres();
                Horas misHoras = new Horas();

                int codeNum = Integer.parseInt(txtCode.getText());
                miCodigo.setCode(codeNum);

                String nombres = txtNames.getText();
                miNombre.setNombres(nombres);

                int horasTrab = Integer.parseInt(txtHours.getText());
                misHoras.setHoras(horasTrab);

                double valorHora = Double.parseDouble(txtValue.getText());
                misHoras.setValor(valorHora);

                double retencion = Double.parseDouble(txtRetention.getText());
                misHoras.setRetencion(retencion);

                double salarioBruto = misHoras.calcularBruto();
                double salarioNeto = misHoras.calcularNeto();

                JOptionPane.showMessageDialog(null, "Codigo: "+ codeNum +
                        "\nNombres: "+ nombres + "\nHoras Trabajadas: "+ horasTrab + "\nValor de la Hora: "+
                        valorHora + "\nRetencion: "+ retencion + "\nSalario Bruto: "+ salarioBruto +
                        "\nSalario Neto: "+ salarioNeto);
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtCode.setText("");
                txtNames.setText("");
                txtHours.setText("");
                txtValue.setText("");
                txtRetention.setText("");
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }

    public static void main(String args[]) {
        Salario form = new Salario(null);
    }
}
