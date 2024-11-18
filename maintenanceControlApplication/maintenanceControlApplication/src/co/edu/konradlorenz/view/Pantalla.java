package co.edu.konradlorenz.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pantalla extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Pantalla frame = new Pantalla();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Pantalla() {
        setBackground(new Color(255, 255, 255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1145, 560); // Mismas dimensiones que la pantalla principal
        contentPane = new JPanel();
        contentPane.setForeground(SystemColor.text);
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Título
        JLabel titulo = new JLabel("¡Bienvenido(a) al Futuro del Mantenimiento Industrial!");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("Book Antiqua", Font.BOLD, 20));
        titulo.setBounds(342, 130, 570, 50);
        contentPane.add(titulo);

        // Logo
        JLabel imagenLogo = new JLabel("");
        imagenLogo.setHorizontalAlignment(SwingConstants.CENTER);
        imagenLogo.setIcon(new ImageIcon(getClass().getResource("/images/logo tecnicas.png")));
        imagenLogo.setBounds(10, 11, 245, 86);
        contentPane.add(imagenLogo);


        // Panel izquierdo con el menú
        JPanel panelMenu = new JPanel();
        panelMenu.setBackground(Color.BLUE);
        panelMenu.setBounds(0, 130, 224, 391);
        contentPane.add(panelMenu);
        panelMenu.setLayout(null);

        // Botón "MÁQUINAS" con menú emergente
        JButton maquinasButton = new JButton("MÁQUINAS");
        maquinasButton.setForeground(Color.WHITE);
        maquinasButton.setBackground(Color.BLUE);
        maquinasButton.setFocusPainted(false);
        maquinasButton.setBounds(20, 20, 180, 30);
        panelMenu.add(maquinasButton);

     // Submenú de máquinas
        JPopupMenu maquinasMenu = new JPopupMenu();
        JMenuItem agregarMaquina = new JMenuItem("Agregar Máquina");
        JMenuItem eliminarMaquina = new JMenuItem("Eliminar Máquina");
        JMenuItem buscarMaquina = new JMenuItem("Buscar Máquina");
        JMenuItem reporteMaquinas = new JMenuItem("Reporte de Máquinas");

        maquinasMenu.add(agregarMaquina);
        maquinasMenu.add(eliminarMaquina);
        maquinasMenu.add(buscarMaquina);
        maquinasMenu.add(reporteMaquinas);

        // Mostrar el menú emergente al hacer clic
        maquinasButton.addActionListener(e -> maquinasMenu.show(maquinasButton, 0, maquinasButton.getHeight()));

        // ActionListener para abrir el formulario de "Agregar Máquina"
        agregarMaquina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear y mostrar la ventana de FormularioAgregarMaquina
                FormularioAgregarMaquina formulario = new FormularioAgregarMaquina();
                formulario.setVisible(true);
            }
        }
        );


        // Botón "MANTENIMIENTO" con menú emergente
        JButton mantenimientoButton = new JButton("MANTENIMIENTO");
        mantenimientoButton.setForeground(Color.WHITE);
        mantenimientoButton.setBackground(Color.BLUE);
        mantenimientoButton.setFocusPainted(false);
        mantenimientoButton.setBounds(20, 70, 180, 30);
        panelMenu.add(mantenimientoButton);

        // Submenú de mantenimiento
        JPopupMenu mantenimientoMenu = new JPopupMenu();
        JMenuItem agregarMantenimiento = new JMenuItem("Agregar Mantenimiento");
        JMenuItem eliminarMantenimiento = new JMenuItem("Eliminar Mantenimiento");
        JMenuItem buscarMantenimiento = new JMenuItem("Buscar Mantenimiento");
        JMenuItem reporteMantenimiento = new JMenuItem("Reporte de Mantenimiento");

        mantenimientoMenu.add(agregarMantenimiento);
        mantenimientoMenu.add(eliminarMantenimiento);
        mantenimientoMenu.add(buscarMantenimiento);
        mantenimientoMenu.add(reporteMantenimiento);

        // Mostrar el menú emergente al hacer clic
        mantenimientoButton.addActionListener(e -> mantenimientoMenu.show(mantenimientoButton, 0, mantenimientoButton.getHeight()));

        // Acciones para los submenús
        eliminarMaquina.addActionListener(e -> JOptionPane.showMessageDialog(this, "Funcionalidad: Eliminar Máquina"));
        buscarMaquina.addActionListener(e -> JOptionPane.showMessageDialog(this, "Funcionalidad: Buscar Máquina"));
        reporteMaquinas.addActionListener(e -> JOptionPane.showMessageDialog(this, "Funcionalidad: Reporte de Máquinas"));

        agregarMantenimiento.addActionListener(e -> JOptionPane.showMessageDialog(this, "Funcionalidad: Agregar Mantenimiento"));
        eliminarMantenimiento.addActionListener(e -> JOptionPane.showMessageDialog(this, "Funcionalidad: Eliminar Mantenimiento"));
        buscarMantenimiento.addActionListener(e -> JOptionPane.showMessageDialog(this, "Funcionalidad: Buscar Mantenimiento"));
        reporteMantenimiento.addActionListener(e -> JOptionPane.showMessageDialog(this, "Funcionalidad: Reporte de Mantenimiento"));

        setLocationRelativeTo(null); // Centrar la ventana
    }
}
