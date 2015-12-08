package presentacion;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author PIX
 */
public class MenuPrincipalVentana extends javax.swing.JFrame {

    private final CreadorPaneles creadorPaneles;

    public MenuPrincipalVentana() {
        creadorPaneles = new CreadorPaneles();
        initComponents();
        configurarVentana();
        configurarEventosMenus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalPanel = new javax.swing.JPanel();
        principalBarraMenu = new javax.swing.JMenuBar();
        ventaMenu = new javax.swing.JMenu();
        nuevaVentaSubmenu = new javax.swing.JMenuItem();
        corteCajaSubmenu = new javax.swing.JMenuItem();
        productoMenu = new javax.swing.JMenu();
        registroProductoSubmenu = new javax.swing.JMenuItem();
        modificacionProductoSubmenu = new javax.swing.JMenuItem();
        eliminacionProductoSubmenu = new javax.swing.JMenuItem();
        inventarioProductoSubmenu = new javax.swing.JMenuItem();
        productosMasVendidosSubmenu = new javax.swing.JMenuItem();
        insumoMenu = new javax.swing.JMenu();
        registroInsumoSubmenu = new javax.swing.JMenuItem();
        modificarInsumoSubmenu = new javax.swing.JMenuItem();
        eliminacionInsumoSubmenu = new javax.swing.JMenuItem();
        inventarioInsumoSubmenu = new javax.swing.JMenuItem();
        proveedorMenu = new javax.swing.JMenu();
        registroProveedorSubmenu = new javax.swing.JMenuItem();
        modificarProveedorSubmenu = new javax.swing.JMenuItem();
        eliminacionProveedorSubmenu = new javax.swing.JMenuItem();
        consultaProveedoresSubmenu = new javax.swing.JMenuItem();
        reporteMenu = new javax.swing.JMenu();
        generacionReporteSubmenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout principalPanelLayout = new javax.swing.GroupLayout(principalPanel);
        principalPanel.setLayout(principalPanelLayout);
        principalPanelLayout.setHorizontalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1375, Short.MAX_VALUE)
        );
        principalPanelLayout.setVerticalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );

        principalBarraMenu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        ventaMenu.setText("Venta");
        ventaMenu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        nuevaVentaSubmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/venta_barra_menu.png"))); // NOI18N
        nuevaVentaSubmenu.setText("Nueva Venta");
        ventaMenu.add(nuevaVentaSubmenu);

        corteCajaSubmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/corte_barra_menu.png"))); // NOI18N
        corteCajaSubmenu.setText("Corte Caja");
        ventaMenu.add(corteCajaSubmenu);

        principalBarraMenu.add(ventaMenu);

        productoMenu.setText("Producto");
        productoMenu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        registroProductoSubmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/agregar_barra_menu.png"))); // NOI18N
        registroProductoSubmenu.setText("Agregar");
        productoMenu.add(registroProductoSubmenu);

        modificacionProductoSubmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/editar_barra_menu.png"))); // NOI18N
        modificacionProductoSubmenu.setText("Modificar");
        productoMenu.add(modificacionProductoSubmenu);

        eliminacionProductoSubmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/eliminar_barra_menu.png"))); // NOI18N
        eliminacionProductoSubmenu.setText("Eliminar");
        productoMenu.add(eliminacionProductoSubmenu);

        inventarioProductoSubmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/inventario_barra_menu.png"))); // NOI18N
        inventarioProductoSubmenu.setText("Inventario");
        productoMenu.add(inventarioProductoSubmenu);

        productosMasVendidosSubmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/mas_vendidos_barra_menu.png"))); // NOI18N
        productosMasVendidosSubmenu.setText("Mas Vendidos");
        productoMenu.add(productosMasVendidosSubmenu);

        principalBarraMenu.add(productoMenu);

        insumoMenu.setText("Insumo");
        insumoMenu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        registroInsumoSubmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/agregar_barra_menu.png"))); // NOI18N
        registroInsumoSubmenu.setText("Agregar");
        insumoMenu.add(registroInsumoSubmenu);

        modificarInsumoSubmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/editar_barra_menu.png"))); // NOI18N
        modificarInsumoSubmenu.setText("Modificar");
        insumoMenu.add(modificarInsumoSubmenu);

        eliminacionInsumoSubmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/eliminar_barra_menu.png"))); // NOI18N
        eliminacionInsumoSubmenu.setText("Eliminar");
        insumoMenu.add(eliminacionInsumoSubmenu);

        inventarioInsumoSubmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/inventario_barra_menu.png"))); // NOI18N
        inventarioInsumoSubmenu.setText("Inventario");
        insumoMenu.add(inventarioInsumoSubmenu);

        principalBarraMenu.add(insumoMenu);

        proveedorMenu.setText("Proveedor");
        proveedorMenu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        registroProveedorSubmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/agregar_barra_menu.png"))); // NOI18N
        registroProveedorSubmenu.setText("Agregar");
        proveedorMenu.add(registroProveedorSubmenu);

        modificarProveedorSubmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/editar_barra_menu.png"))); // NOI18N
        modificarProveedorSubmenu.setText("Modificar");
        proveedorMenu.add(modificarProveedorSubmenu);

        eliminacionProveedorSubmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/eliminar_barra_menu.png"))); // NOI18N
        eliminacionProveedorSubmenu.setText("Eliminar");
        proveedorMenu.add(eliminacionProveedorSubmenu);

        consultaProveedoresSubmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/proveedor_barra_menu.png"))); // NOI18N
        consultaProveedoresSubmenu.setText("Consulta");
        proveedorMenu.add(consultaProveedoresSubmenu);

        principalBarraMenu.add(proveedorMenu);

        reporteMenu.setText("Reporte");
        reporteMenu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        generacionReporteSubmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/recursos/generar_barra_menu.png"))); // NOI18N
        generacionReporteSubmenu.setText("Generar");
        reporteMenu.add(generacionReporteSubmenu);

        principalBarraMenu.add(reporteMenu);

        setJMenuBar(principalBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem consultaProveedoresSubmenu;
    private javax.swing.JMenuItem corteCajaSubmenu;
    private javax.swing.JMenuItem eliminacionInsumoSubmenu;
    private javax.swing.JMenuItem eliminacionProductoSubmenu;
    private javax.swing.JMenuItem eliminacionProveedorSubmenu;
    private javax.swing.JMenuItem generacionReporteSubmenu;
    private javax.swing.JMenu insumoMenu;
    private javax.swing.JMenuItem inventarioInsumoSubmenu;
    private javax.swing.JMenuItem inventarioProductoSubmenu;
    private javax.swing.JMenuItem modificacionProductoSubmenu;
    private javax.swing.JMenuItem modificarInsumoSubmenu;
    private javax.swing.JMenuItem modificarProveedorSubmenu;
    private javax.swing.JMenuItem nuevaVentaSubmenu;
    private javax.swing.JMenuBar principalBarraMenu;
    private javax.swing.JPanel principalPanel;
    private javax.swing.JMenu productoMenu;
    private javax.swing.JMenuItem productosMasVendidosSubmenu;
    private javax.swing.JMenu proveedorMenu;
    private javax.swing.JMenuItem registroInsumoSubmenu;
    private javax.swing.JMenuItem registroProductoSubmenu;
    private javax.swing.JMenuItem registroProveedorSubmenu;
    private javax.swing.JMenu reporteMenu;
    private javax.swing.JMenu ventaMenu;
    // End of variables declaration//GEN-END:variables

    private enum Paneles {

        RegistroProducto("presentacion.productos.FormularioRegistroProducto"),
        EliminacionProducto("presentacion.productos.FormularioEliminacionProducto"),
        ModificacionProducto("presentacion.productos.FormularioModificacionProducto"),
        InventarioProductos("presentacion.productos.InventarioProductosPanel"),
        ProductosMasVendidos("presentacion.productos.MasVendidosProductosPanel"),
        RegistroInsumo("presentacion.insumos.FormularioRegistroInsumo"),
        EliminacionInsumo("presentacion.insumos.FormularioEliminacionInsumo"),
        ModificacionInsumo("presentacion.insumos.FormularioModificacionInsumo"),
        InventarioInsumos("presentacion.insumos.InventarioInsumosPanel"),
        RegistroProveedor("presentacion.proveedores.FormularioRegistroProveedor"),
        EliminacionProveedor("presentacion.proveedores.FormularioEliminacionProveedor"),
        ModificacionProveedor("presentacion.proveedores.FormularioModificacionProveedor"),
        DirectorioProveedores("presentacion.proveedores.DirectorioProveedoresPanel"),
        GeneradorReporte("presentacion.reportes.GeneradorReportePanel"),
        RegistroVentas("presentacion.ventas.RegistroVentasPanel"),
        CorteCajaDesglose("presentacion.ventas.CorteCajaDesglosePanel"),
        Default("presentacion.inicio.DefaultPanel");

        private final String nombre;

        private Paneles(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return this.nombre;
        }

        public String obtenerNombre() {
            return this.nombre;
        }
    }

    private void mostrarPanel(String nombrePanel) {
        JPanel panelCreado = creadorPaneles.crear(nombrePanel);
        principalPanel.add(panelCreado, nombrePanel);

        CardLayout layoutPanel = (CardLayout) (principalPanel.getLayout());
        layoutPanel.show(principalPanel, nombrePanel);
    }

    private void configurarVentana() {
        setExtendedState(MAXIMIZED_BOTH);
        CardLayout layoutPestanias = new CardLayout();
        principalPanel.setLayout(layoutPestanias);
        mostrarPanel(Paneles.Default.obtenerNombre());
    }

    private void configurarEventosMenus() {

        configurarEventosMenuProducto();
        configurarEventosMenuInsumo();
        configurarEventosMenuProveedor();
        configurarEventoMenuReporte();
        configurarEventosMenuVenta();

    }

    private void configurarEventosMenuProducto() {
        registroProductoSubmenu.addActionListener(
                evento -> mostrarPanel(Paneles.RegistroProducto.obtenerNombre()));
        modificacionProductoSubmenu.addActionListener(
                evento -> mostrarPanel(Paneles.ModificacionProducto.obtenerNombre()));
        eliminacionProductoSubmenu.addActionListener(
                evento -> mostrarPanel(Paneles.EliminacionProducto.obtenerNombre()));
        inventarioProductoSubmenu.addActionListener(
                evento -> mostrarPanel(Paneles.InventarioProductos.obtenerNombre()));
        productosMasVendidosSubmenu.addActionListener(
                evento -> mostrarPanel(Paneles.ProductosMasVendidos.obtenerNombre()));
    }

    private void configurarEventosMenuInsumo() {
        registroInsumoSubmenu.addActionListener(
                evento -> mostrarPanel(Paneles.RegistroInsumo.obtenerNombre()));
        modificarInsumoSubmenu.addActionListener(
                evento -> mostrarPanel(Paneles.ModificacionInsumo.obtenerNombre()));
        eliminacionInsumoSubmenu.addActionListener(
                evento -> mostrarPanel(Paneles.EliminacionInsumo.obtenerNombre()));
        inventarioInsumoSubmenu.addActionListener(
                evento -> mostrarPanel(Paneles.InventarioInsumos.obtenerNombre()));
    }

    private void configurarEventosMenuProveedor() {
        registroProveedorSubmenu.addActionListener(
                evento -> mostrarPanel(Paneles.RegistroProveedor.obtenerNombre()));
        modificarProveedorSubmenu.addActionListener(
                evento -> mostrarPanel(Paneles.ModificacionProveedor.obtenerNombre()));
        eliminacionProveedorSubmenu.addActionListener(
                evento -> mostrarPanel(Paneles.EliminacionProveedor.obtenerNombre()));
        consultaProveedoresSubmenu.addActionListener(
                evento -> mostrarPanel(Paneles.DirectorioProveedores.obtenerNombre()));
    }

    private void configurarEventoMenuReporte() {
        generacionReporteSubmenu.addActionListener(
                evento -> mostrarPanel(Paneles.GeneradorReporte.obtenerNombre()));
    }

    private void configurarEventosMenuVenta() {
        nuevaVentaSubmenu.addActionListener(
                evento -> mostrarPanel(Paneles.RegistroVentas.obtenerNombre()));
        corteCajaSubmenu.addActionListener(
                evento -> mostrarPanel(Paneles.CorteCajaDesglose.obtenerNombre()));
    }

}
