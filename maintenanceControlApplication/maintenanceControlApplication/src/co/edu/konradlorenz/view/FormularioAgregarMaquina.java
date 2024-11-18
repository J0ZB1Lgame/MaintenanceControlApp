package co.edu.konradlorenz.view;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import co.edu.konradlorenz.model.Maquina; 

public class FormularioAgregarMaquina extends JFrame {
    private List<Maquina> maquinas = new ArrayList<>();

    private JPanel contentPane;
    private JTextField txtIdMaquina;
    private JTextField txtNombreMaquina;
    private JTextField textEstadoMaquina;
    private JTextField textFechaUltimoMantenimiento;
    private JTextField txtDescripcionMaquina;

    // Constructor que configura la ventana
    public FormularioAgregarMaquina() {
    	
    	
        setTitle("Agregar Máquina");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 1145, 560); // Mismas dimensiones que la pantalla principal
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Título de la ventana
        JLabel titulo = new JLabel("AGREGAR NUEVA MÁQUINA");
        titulo.setHorizontalAlignment(SwingConstants.LEFT);
        titulo.setFont(new Font("Century Gothic", Font.BOLD, 20));
        titulo.setBounds(322, 145, 366, 50);
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
        });

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

        // Formulario para agregar máquina
        JLabel lblIdMaquina = new JLabel("ID:");
        lblIdMaquina.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblIdMaquina.setBounds(322, 219, 149, 15);
        contentPane.add(lblIdMaquina);

        txtIdMaquina = new JTextField();
        txtIdMaquina.setForeground(Color.BLACK);
        txtIdMaquina.setToolTipText("  Ingrese el ID de la máquina");
        txtIdMaquina.setBounds(420, 217, 200, 25);
        contentPane.add(txtIdMaquina);

        JLabel lblNombreMaquina = new JLabel("Nombre:");
        lblNombreMaquina.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNombreMaquina.setBounds(322, 270, 100, 15);
        contentPane.add(lblNombreMaquina);

        txtNombreMaquina = new JTextField();
        txtNombreMaquina.setToolTipText("  Ingrese el nombre de la máquina");
        txtNombreMaquina.setForeground(Color.BLACK);
        txtNombreMaquina.setBounds(420, 264, 200, 25);
        contentPane.add(txtNombreMaquina);

        JLabel lblDescripcionMaquina = new JLabel("Descripción:");
        lblDescripcionMaquina.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblDescripcionMaquina.setBounds(322, 322, 100, 15);
        contentPane.add(lblDescripcionMaquina);
        
        JLabel lblEstadoMaquina = new JLabel("Estado:");
        lblEstadoMaquina.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblEstadoMaquina.setBounds(694, 220, 100, 15);
        contentPane.add(lblEstadoMaquina);
        
        textEstadoMaquina = new JTextField();
        textEstadoMaquina.setToolTipText("   Ingrese el estado de la máquina");
        textEstadoMaquina.setForeground(Color.BLACK);
        textEstadoMaquina.setBounds(892, 215, 200, 25);
        contentPane.add(textEstadoMaquina);
        
        JLabel lblFechaltimoMantenimiento = new JLabel("Fecha Último Mantenimiento:");
        lblFechaltimoMantenimiento.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblFechaltimoMantenimiento.setBounds(694, 271, 188, 15);
        contentPane.add(lblFechaltimoMantenimiento);
        
        textFechaUltimoMantenimiento = new JTextField();
        textFechaUltimoMantenimiento.setForeground(Color.BLACK);
        textFechaUltimoMantenimiento.setToolTipText("  Ingrese dd/mm/aa");
        textFechaUltimoMantenimiento.setBounds(892, 264, 200, 25);
        contentPane.add(textFechaUltimoMantenimiento);
        
        Button button = new Button("Agregar");
        button.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 12));
        button.setForeground(Color.WHITE);
        button.setBackground(Color.BLUE);
        button.setBounds(322, 370, 90, 32);
        contentPane.add(button);
        
        txtDescripcionMaquina = new JTextField();
        txtDescripcionMaquina.setToolTipText("  Ingrese una descripción");
        txtDescripcionMaquina.setForeground(Color.BLACK);
        txtDescripcionMaquina.setBounds(420, 320, 200, 25);
        contentPane.add(txtDescripcionMaquina);

        // Acción del botón "Agregar"
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Capturar los datos ingresados por el usuario
                int id = Integer.parseInt(txtIdMaquina.getText());
                String nombre = txtNombreMaquina.getText();
                String descripcion = txtDescripcionMaquina.getText();
                String estado = textEstadoMaquina.getText();
                String fecha = textFechaUltimoMantenimiento.getText();

                // Crear una nueva instancia de Maquina
                Maquina nuevaMaquina = new Maquina(id, nombre, descripcion, estado, fecha);

                // Agregar la máquina a la lista
                maquinas.add(nuevaMaquina);

                // Mostrar un mensaje indicando que la máquina fue agregada
                JOptionPane.showMessageDialog(null, "Máquina Agregada Correctamente");

                // Imprimir la máquina en consola (opcional)
                System.out.println(nuevaMaquina.toString());

                // Limpiar los campos para agregar otra máquina (opcional)
                txtIdMaquina.setText("");
                txtNombreMaquina.setText("");
                txtDescripcionMaquina.setText("");
                textEstadoMaquina.setText("");
                textFechaUltimoMantenimiento.setText("");

                // Cerrar la ventana
                dispose();
            }
        }); 
    } 
    
} 
