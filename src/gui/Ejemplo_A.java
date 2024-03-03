package gui;

import clase.Alumno;
import arreglo.ArregloAlumnos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejemplo_A extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JLabel lblCodigo;
	private JLabel lblNombre;
	private JLabel lblNota1;
	private JLabel lblNota2;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtNota1;	
	private JTextField txtNota2;
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JScrollPane scrollPane;
	private JTable tblTabla;
	private DefaultTableModel modelo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo_A frame = new Ejemplo_A();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejemplo_A() {
		setTitle("Ejemplo_A - Semana_14");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 777, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setBounds(10, 11, 40, 28);
		contentPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(54, 11, 40, 28);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(120, 11, 50, 28);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(170, 11, 60, 28);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblNota1 = new JLabel("Nota 1");
		lblNota1.setBounds(487, 87, 40, 28);
		contentPane.add(lblNota1);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(527, 87, 40, 28);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		lblNota2 = new JLabel("Nota 2");
		lblNota2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNota2.setBounds(477, 126, 40, 28);
		contentPane.add(lblNota2);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(527, 126, 40, 28);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);

		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(596, 173, 155, 23);
		contentPane.add(btnAdicionar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(this);
		btnConsultar.setBounds(596, 210, 155, 23);
		contentPane.add(btnConsultar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setBounds(596, 250, 155, 23);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(596, 284, 155, 23);
		contentPane.add(btnEliminar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 50, 432, 274);
		contentPane.add(scrollPane);
		
		tblTabla = new JTable();
		tblTabla.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblTabla);

		modelo = new DefaultTableModel();
		modelo.addColumn("código");
		modelo.addColumn("nombre");
		modelo.addColumn("Paterno");
		modelo.addColumn("Materno");
		modelo.addColumn("nota 1");
		modelo.addColumn("nota 2");
		modelo.addColumn("nota 3");
		modelo.addColumn("nota 4");
		modelo.addColumn("promedio");
		tblTabla.setModel(modelo);
		
		txtapellidoPaterno = new JTextField();
		txtapellidoPaterno.setColumns(10);
		txtapellidoPaterno.setBounds(327, 11, 60, 28);
		contentPane.add(txtapellidoPaterno);
		
		txtapellidoMaterno = new JTextField();
		txtapellidoMaterno.setColumns(10);
		txtapellidoMaterno.setBounds(478, 11, 60, 28);
		contentPane.add(txtapellidoMaterno);
		
		lblPaterno = new JLabel("Paterno");
		lblPaterno.setBounds(267, 11, 50, 28);
		contentPane.add(lblPaterno);
		
		lblMaterno = new JLabel("Materno");
		lblMaterno.setBounds(418, 11, 50, 28);
		contentPane.add(lblMaterno);
		
		txtNota3 = new JTextField();
		txtNota3.setColumns(10);
		txtNota3.setBounds(527, 174, 40, 28);
		contentPane.add(txtNota3);
		
		txtNota4 = new JTextField();
		txtNota4.setColumns(10);
		txtNota4.setBounds(527, 210, 40, 28);
		contentPane.add(txtNota4);
		
		lblNota = new JLabel("Nota 3");
		lblNota.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNota.setBounds(477, 170, 40, 28);
		contentPane.add(lblNota);
		
		lblNota_1 = new JLabel("Nota 4");
		lblNota_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNota_1.setBounds(477, 207, 40, 28);
		contentPane.add(lblNota_1);
		
		listar();		
	}
	
	//  Declaración global
	ArregloAlumnos aa = new ArregloAlumnos();
	private JTextField txtapellidoPaterno;
	private JTextField txtapellidoMaterno;
	private JLabel lblPaterno;
	private JLabel lblMaterno;
	private JTextField txtNota3;
	private JTextField txtNota4;
	private JLabel lblNota;
	private JLabel lblNota_1;
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			actionPerformedBtnModificar(arg0);
		}
		if (arg0.getSource() == btnConsultar) {
			actionPerformedBtnConsultar(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
	}
	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		/**
		 * Adiciona un nuevo alumno validando que el código no se repita
		 */	
		try {
			int codigo = leerCodigo();
			if (aa.buscar(codigo) == null) {
				String nombre = leerNombre();
				String apellidoPaterno = leerapellidoPaterno();
				String apellidoMaterno = leerapellidoMaterno();
				if (nombre.length() > 0 && apellidoPaterno.length() >0 && apellidoMaterno.length() > 0)
					try {
						int nota1 = leerNota1();
						try {
							int nota2 = leerNota2();
							try {
								int nota3 = leerNota3();
								try {
									int nota4 = leerNota4();
							Alumno nuevo = new Alumno(codigo, nombre, apellidoPaterno, apellidoMaterno, nota1, nota2, nota3, nota4);
							aa.adicionar(nuevo);
							listar();
							limpieza();
								}
								catch(Exception e) {
									error("ingrese Nota 4", txtNota4);
								}
							}
							catch(Exception e) {
								error("ingrese NOTA 3", txtNota3);
							}
						}
						catch (Exception e) {
							error("ingrese NOTA 2", txtNota2);
						}
					}
					catch (Exception e) {
						error("ingrese NOTA 1", txtNota1);
					}
				else 
					mensaje("ingrese NOMBRE o APELLIDOS");
			}
			else
				error("el CÓDIGO ya existe", txtCodigo);
		}
		catch (Exception e) {
			error("ingrese CÓDIGO", txtCodigo);
		}
	}
	protected void actionPerformedBtnConsultar(ActionEvent arg0) {
		/**
		 * Busca un código y si existe muestra los datos del alumno
		 */
		try {
			int codigo = leerCodigo();
			Alumno a = aa.buscar(codigo);
			if (a == null) {
				mensaje("el CÓDIGO no existe");
				limpieza();
			}
			else {
				txtNombre.setText(a.getNombre());
				txtNombre.setText(a.getapellidoPaterno());
				txtNombre.setText(a.getapellidoMaterno());
				txtNota1.setText("" + a.getNota1());
				txtNota2.setText("" + a.getNota2());
				txtNota2.setText("" + a.getNota3());
				txtNota2.setText("" + a.getNota4());
				txtCodigo.requestFocus();
			}
		}
		catch (Exception e) {
			mensaje("ingrese CÓDIGO");
			limpieza();
		}
	}
	protected void actionPerformedBtnModificar(ActionEvent arg0) {
		/**
		 * Modifica los datos de un alumnno
		 */	
		try {
			int codigo = leerCodigo();
			Alumno x = aa.buscar(codigo);
			if (x != null) {
				String nombre = leerNombre();
				String apellidoPaterno = leerapellidoPaterno();
				String apellidoMaterno = leerapellidoMaterno();
				if (nombre.length() > 0 && apellidoPaterno.length() >0 && apellidoMaterno.length() > 0)
					try {
						int nota1 = leerNota1();
						try {
							int nota2 = leerNota2();
							try {
								int nota3 = leerNota3();
								try {
									int nota4 = leerNota4();
							x.setCodigo(codigo);
							x.setNombre(nombre);
							x.setNombre(apellidoPaterno);
							x.setNombre(apellidoMaterno);
							x.setNota1(nota1);
							x.setNota2(nota2);
							x.setNota2(nota3);
							x.setNota2(nota4);
							aa.actualizarArchivo();
							listar();
							limpieza();
								}
								catch(Exception e) {
									error("ingrese NOTA 4", txtNota4);
								}
							}
							catch(Exception e) {
								error("ingrese NOTA 3", txtNota3);
							}
						}
						catch (Exception e) {
							error("ingrese NOTA 2", txtNota2);
						}
					}
					catch (Exception e) {
						error("ingrese NOTA 1", txtNota1);
					}
				else 
					error("ingrese NOMBRE", txtNombre);
			}
			else
				error("el CÓDIGO no existe", txtCodigo);
		}
		catch (Exception e) {
			error("ingrese CÓDIGO", txtCodigo);
		}
	}
	protected void actionPerformedBtnEliminar(ActionEvent arg0) {
		/**
		 * Busca un código y si existe retira al alumno del arreglo
		 */	
		try {
			int codigo = leerCodigo();
			Alumno a = aa.buscar(codigo);
			if (a == null)
				mensaje("el CÓDIGO no existe");
			else {
				aa.eliminar(a);
				listar();
			}
			limpieza();
		}
		catch (Exception e) {
			error("ingrese CÓDIGO", txtCodigo);
		}
	}
	//  Métodos tipo void (sin parámetros)
	void limpieza() {
		txtCodigo.setText("");
		txtNombre.setText("");
		txtapellidoMaterno.setText("");
		txtapellidoMaterno.setText("");
		txtNota1.setText("");
		txtNota2.setText("");
		txtNota3.setText("");
		txtNota4.setText("");
		txtCodigo.requestFocus();
	}	
   	void listar() {
		modelo.setRowCount(0);
		for (int i=0; i<aa.tamanio(); i++) {
			Object[] fila = { aa.obtener(i).getCodigo(),
					          aa.obtener(i).getNombre(),
					          aa.obtener(i).getapellidoPaterno(),
					          aa.obtener(i).getapellidoMaterno(),
					          aa.obtener(i).getNota1(),
					          aa.obtener(i).getNota2(),
					          aa.obtener(i).getNota3(),
					          aa.obtener(i).getNota4(),
					          aa.obtener(i).promedio() };
			modelo.addRow(fila);
		}
	}
	//  Métodos tipo void (con parámetros)
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}
	void error(String s, JTextField txt) {
		mensaje(s);
		txt.setText("");
		txt.requestFocus();
	}
	//  Métodos que retornan valor (sin parámetros)
	int leerCodigo() {
		return Integer.parseInt(txtCodigo.getText().trim());
	}
	String leerNombre() {
		return txtNombre.getText().trim();
	}
	String leerapellidoPaterno() {
		return txtapellidoPaterno.getText().trim();
	}
	String leerapellidoMaterno() {
		return txtapellidoMaterno.getText().trim();
	}
	int leerNota1() {
		return Integer.parseInt(txtNota1.getText().trim());
	}
	int leerNota2() {
		return Integer.parseInt(txtNota2.getText().trim());
	}
	int leerNota3() {
		return Integer.parseInt(txtNota3.getText().trim());
	}
	int leerNota4() {
		return Integer.parseInt(txtNota4.getText().trim());
	}
}
