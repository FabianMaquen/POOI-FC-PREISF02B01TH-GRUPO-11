package GUI;

import Funcionamiento.Aula;
import Funcionamiento.Aula;
import Funcionamiento.Curso;
import Funcionamiento.Estudiante;
import java.awt.Color;
import java.util.List;
import javax.swing.JFrame;

public class InfoCurso extends JFrame {

    private Estudiante estudiante;
    private Cursos ventanaCursos;
    private List<Curso> cursos;
    private String nombreCurso;
    private String numeroCreditos;
    private Aula aula;
    
    public InfoCurso() {
        initComponents();
        this.setLocationRelativeTo(null);
        setBackground(new Color(0, 0,0, 0));
    }
    
    public InfoCurso(Estudiante estudiante, Cursos ventanaCursos, List<Curso> cursos, String nombreCurso,String numeroCreditos, Aula aula) {
        initComponents();
        this.estudiante = estudiante;
        this.ventanaCursos = ventanaCursos;
        this.cursos = cursos;
        this.nombreCurso = nombreCurso;
        this.numeroCreditos = numeroCreditos;
        this.aula = aula;
        this.setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
        setUpCursos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_ultima_capa = new javax.swing.JPanel();
        jl_cursos_titulo = new javax.swing.JLabel();
        jb_retroceder = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();
        panelRound1 = new MyContainers.PanelRound();
        jSeparator1 = new javax.swing.JSeparator();
        jl_titulo_evaluaciones = new javax.swing.JLabel();
        jl_titulo_horario = new javax.swing.JLabel();
        jl_hora_curso1 = new javax.swing.JLabel();
        jl_nombre_curso = new javax.swing.JLabel();
        jl_titulo_lugar_aula = new javax.swing.JLabel();
        logo_reloj = new javax.swing.JLabel();
        panelRound_periodo = new MyContainers.PanelRound();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jl_numero_veces_cursado = new javax.swing.JLabel();
        jl_numero_ciclo = new javax.swing.JLabel();
        jl_numero_creditos = new javax.swing.JLabel();
        jl_periodo = new javax.swing.JLabel();
        jl_titulo_cursado = new javax.swing.JLabel();
        jl_titulo_ndeveces = new javax.swing.JLabel();
        jl_titulo_cilo1 = new javax.swing.JLabel();
        jl_titulo_creditos = new javax.swing.JLabel();
        jl_titulo_pertenece = new javax.swing.JLabel();
        panelRound_horario = new MyContainers.PanelRound();
        panelRound6 = new MyContainers.PanelRound();
        jl_L = new javax.swing.JLabel();
        panelRound7 = new MyContainers.PanelRound();
        jl_Ma = new javax.swing.JLabel();
        panelRound8 = new MyContainers.PanelRound();
        jl_Mi = new javax.swing.JLabel();
        panelRound9 = new MyContainers.PanelRound();
        jl_J = new javax.swing.JLabel();
        panelRound10 = new MyContainers.PanelRound();
        jl_V = new javax.swing.JLabel();
        panelRound_S = new MyContainers.PanelRound();
        jl_S = new javax.swing.JLabel();
        panelRound_aula = new MyContainers.PanelRound();
        jl_titulo_campus = new javax.swing.JLabel();
        jl_titulo_aula = new javax.swing.JLabel();
        jl_titulo_pabellon = new javax.swing.JLabel();
        jl_numero_campus = new javax.swing.JLabel();
        jl_numero_pabellon = new javax.swing.JLabel();
        jl_numero_aula = new javax.swing.JLabel();
        panelRound_evaluaciones = new MyContainers.PanelRound();
        jl_titulo_campus1 = new javax.swing.JLabel();
        jl_titulo_campus2 = new javax.swing.JLabel();
        jl_titulo_campus3 = new javax.swing.JLabel();
        fondoCurveadoDegradado1 = new MyContainers.FondoCurveadoDegradado();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jp_ultima_capa.setOpaque(false);
        jp_ultima_capa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_cursos_titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jl_cursos_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jl_cursos_titulo.setText("CURSOS");
        jp_ultima_capa.add(jl_cursos_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 30, -1, -1));

        jb_retroceder.setBackground(new java.awt.Color(38, 65, 115));
        jb_retroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackIcon.png"))); // NOI18N
        jb_retroceder.setBorder(null);
        jb_retroceder.setContentAreaFilled(false);
        jb_retroceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_retroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_retrocederActionPerformed(evt);
            }
        });
        jp_ultima_capa.add(jb_retroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 20, -1, -1));

        jb_salir.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jb_salir.setForeground(new java.awt.Color(255, 255, 255));
        jb_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoSalir35x35.png"))); // NOI18N
        jb_salir.setBorder(null);
        jb_salir.setBorderPainted(false);
        jb_salir.setContentAreaFilled(false);
        jb_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_salir.setFocusPainted(false);
        jb_salir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jb_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salirActionPerformed(evt);
            }
        });
        jp_ultima_capa.add(jb_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 20, 30, -1));

        panelRound1.setBackground(new java.awt.Color(232, 235, 241));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(80);
        panelRound1.setRoundTopRight(80);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(41, 61, 109));
        panelRound1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 340, 10));

        jl_titulo_evaluaciones.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jl_titulo_evaluaciones.setForeground(new java.awt.Color(41, 61, 109));
        jl_titulo_evaluaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_titulo_evaluaciones.setText("Evaluaciones");
        jl_titulo_evaluaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound1.add(jl_titulo_evaluaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 355, 110, 20));

        jl_titulo_horario.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jl_titulo_horario.setForeground(new java.awt.Color(41, 61, 109));
        jl_titulo_horario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_titulo_horario.setText("Horario");
        jl_titulo_horario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound1.add(jl_titulo_horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 60, 20));

        jl_hora_curso1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jl_hora_curso1.setForeground(new java.awt.Color(41, 61, 109));
        jl_hora_curso1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_hora_curso1.setText("x:xx - x:xx xm");
        jl_hora_curso1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound1.add(jl_hora_curso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 90, 20));

        jl_nombre_curso.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jl_nombre_curso.setForeground(new java.awt.Color(41, 61, 109));
        jl_nombre_curso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_nombre_curso.setText("Nombre_Curso");
        jl_nombre_curso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound1.add(jl_nombre_curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 340, 30));

        jl_titulo_lugar_aula.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jl_titulo_lugar_aula.setForeground(new java.awt.Color(41, 61, 109));
        jl_titulo_lugar_aula.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_titulo_lugar_aula.setText("Aula");
        jl_titulo_lugar_aula.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound1.add(jl_titulo_lugar_aula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 355, 60, 20));

        logo_reloj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reloj15x15.png"))); // NOI18N
        panelRound1.add(logo_reloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 233, -1, -1));

        panelRound_periodo.setBackground(new java.awt.Color(255, 255, 255));
        panelRound_periodo.setRoundBottomLeft(20);
        panelRound_periodo.setRoundBottomRight(20);
        panelRound_periodo.setRoundTopLeft(20);
        panelRound_periodo.setRoundTopRight(20);
        panelRound_periodo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator4.setBackground(new java.awt.Color(215, 216, 219));
        jSeparator4.setForeground(new java.awt.Color(41, 61, 109));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelRound_periodo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 45, 10, 85));

        jSeparator3.setBackground(new java.awt.Color(215, 216, 219));
        jSeparator3.setForeground(new java.awt.Color(41, 61, 109));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelRound_periodo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 45, 10, 85));

        jSeparator2.setBackground(new java.awt.Color(215, 216, 219));
        jSeparator2.setForeground(new java.awt.Color(41, 61, 109));
        panelRound_periodo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 340, 10));

        jl_numero_veces_cursado.setFont(new java.awt.Font("Dubai Medium", 0, 48)); // NOI18N
        jl_numero_veces_cursado.setForeground(new java.awt.Color(41, 61, 109));
        jl_numero_veces_cursado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_numero_veces_cursado.setText("1");
        jl_numero_veces_cursado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound_periodo.add(jl_numero_veces_cursado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 75, 30, 40));

        jl_numero_ciclo.setFont(new java.awt.Font("Dubai Medium", 0, 48)); // NOI18N
        jl_numero_ciclo.setForeground(new java.awt.Color(41, 61, 109));
        jl_numero_ciclo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_numero_ciclo.setText("2");
        jl_numero_ciclo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound_periodo.add(jl_numero_ciclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 75, 30, 40));

        jl_numero_creditos.setFont(new java.awt.Font("Dubai Medium", 0, 48)); // NOI18N
        jl_numero_creditos.setForeground(new java.awt.Color(41, 61, 109));
        jl_numero_creditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_numero_creditos.setText("N");
        jl_numero_creditos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound_periodo.add(jl_numero_creditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 75, 30, 40));

        jl_periodo.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jl_periodo.setForeground(new java.awt.Color(41, 61, 109));
        jl_periodo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_periodo.setText("Periodo: 2023 - 02");
        jl_periodo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound_periodo.add(jl_periodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 7, 280, 30));

        jl_titulo_cursado.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jl_titulo_cursado.setForeground(new java.awt.Color(41, 61, 109));
        jl_titulo_cursado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_titulo_cursado.setText("cursado");
        jl_titulo_cursado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound_periodo.add(jl_titulo_cursado, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 67, 90, 20));

        jl_titulo_ndeveces.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jl_titulo_ndeveces.setForeground(new java.awt.Color(41, 61, 109));
        jl_titulo_ndeveces.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_titulo_ndeveces.setText("# de veces");
        jl_titulo_ndeveces.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound_periodo.add(jl_titulo_ndeveces, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 53, 90, 20));

        jl_titulo_cilo1.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jl_titulo_cilo1.setForeground(new java.awt.Color(41, 61, 109));
        jl_titulo_cilo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_titulo_cilo1.setText("Ciclo");
        jl_titulo_cilo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound_periodo.add(jl_titulo_cilo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 67, 90, 20));

        jl_titulo_creditos.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jl_titulo_creditos.setForeground(new java.awt.Color(41, 61, 109));
        jl_titulo_creditos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_titulo_creditos.setText("Créditos");
        jl_titulo_creditos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound_periodo.add(jl_titulo_creditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 53, 90, 20));

        jl_titulo_pertenece.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jl_titulo_pertenece.setForeground(new java.awt.Color(41, 61, 109));
        jl_titulo_pertenece.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_titulo_pertenece.setText("Pertenece al");
        jl_titulo_pertenece.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound_periodo.add(jl_titulo_pertenece, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 53, 90, 20));

        panelRound1.add(panelRound_periodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 85, 340, 120));

        panelRound_horario.setBackground(new java.awt.Color(255, 255, 255));
        panelRound_horario.setRoundBottomLeft(20);
        panelRound_horario.setRoundBottomRight(20);
        panelRound_horario.setRoundTopLeft(20);
        panelRound_horario.setRoundTopRight(20);
        panelRound_horario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound6.setBackground(new java.awt.Color(255, 255, 255));
        panelRound6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 61, 109)));
        panelRound6.setRoundBottomLeft(20);
        panelRound6.setRoundBottomRight(20);
        panelRound6.setRoundTopLeft(20);
        panelRound6.setRoundTopRight(20);
        panelRound6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_L.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jl_L.setForeground(new java.awt.Color(41, 61, 109));
        jl_L.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_L.setText("L");
        jl_L.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound6.add(jl_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 25, 30, 30));

        panelRound_horario.add(panelRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 10, 40, 60));

        panelRound7.setBackground(new java.awt.Color(41, 61, 109));
        panelRound7.setRoundBottomLeft(20);
        panelRound7.setRoundBottomRight(20);
        panelRound7.setRoundTopLeft(20);
        panelRound7.setRoundTopRight(20);
        panelRound7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_Ma.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jl_Ma.setForeground(new java.awt.Color(255, 255, 255));
        jl_Ma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Ma.setText("M");
        jl_Ma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound7.add(jl_Ma, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 25, 30, 30));

        panelRound_horario.add(panelRound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 10, 40, 60));

        panelRound8.setBackground(new java.awt.Color(41, 61, 109));
        panelRound8.setRoundBottomLeft(20);
        panelRound8.setRoundBottomRight(20);
        panelRound8.setRoundTopLeft(20);
        panelRound8.setRoundTopRight(20);
        panelRound8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_Mi.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jl_Mi.setForeground(new java.awt.Color(255, 255, 255));
        jl_Mi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Mi.setText("M");
        jl_Mi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound8.add(jl_Mi, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 25, 30, 30));

        panelRound_horario.add(panelRound8, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 10, 40, 60));

        panelRound9.setBackground(new java.awt.Color(255, 255, 255));
        panelRound9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(41, 61, 109), 1, true));
        panelRound9.setRoundBottomLeft(20);
        panelRound9.setRoundBottomRight(20);
        panelRound9.setRoundTopLeft(20);
        panelRound9.setRoundTopRight(20);
        panelRound9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_J.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jl_J.setForeground(new java.awt.Color(41, 61, 109));
        jl_J.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_J.setText("J");
        jl_J.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound9.add(jl_J, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 25, 30, 30));

        panelRound_horario.add(panelRound9, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 10, 40, 60));

        panelRound10.setBackground(new java.awt.Color(41, 61, 109));
        panelRound10.setRoundBottomLeft(20);
        panelRound10.setRoundBottomRight(20);
        panelRound10.setRoundTopLeft(20);
        panelRound10.setRoundTopRight(20);
        panelRound10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_V.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jl_V.setForeground(new java.awt.Color(255, 255, 255));
        jl_V.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_V.setText("V");
        jl_V.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound10.add(jl_V, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 25, 30, 30));

        panelRound_horario.add(panelRound10, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 10, 40, 60));

        panelRound_S.setBackground(new java.awt.Color(255, 255, 255));
        panelRound_S.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 61, 109)));
        panelRound_S.setRoundBottomLeft(20);
        panelRound_S.setRoundBottomRight(20);
        panelRound_S.setRoundTopLeft(20);
        panelRound_S.setRoundTopRight(20);
        panelRound_S.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_S.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jl_S.setForeground(new java.awt.Color(41, 61, 109));
        jl_S.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_S.setText("S");
        jl_S.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound_S.add(jl_S, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 25, 30, 30));

        panelRound_horario.add(panelRound_S, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 40, 60));

        panelRound1.add(panelRound_horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 255, 340, 80));

        panelRound_aula.setBackground(new java.awt.Color(255, 255, 255));
        panelRound_aula.setRoundBottomLeft(20);
        panelRound_aula.setRoundBottomRight(20);
        panelRound_aula.setRoundTopLeft(20);
        panelRound_aula.setRoundTopRight(20);
        panelRound_aula.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_titulo_campus.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jl_titulo_campus.setForeground(new java.awt.Color(41, 61, 109));
        jl_titulo_campus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_titulo_campus.setText("Campus:");
        jl_titulo_campus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound_aula.add(jl_titulo_campus, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 50, 20));

        jl_titulo_aula.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jl_titulo_aula.setForeground(new java.awt.Color(41, 61, 109));
        jl_titulo_aula.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_titulo_aula.setText("Aula:");
        jl_titulo_aula.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound_aula.add(jl_titulo_aula, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 50, 50, 20));

        jl_titulo_pabellon.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jl_titulo_pabellon.setForeground(new java.awt.Color(41, 61, 109));
        jl_titulo_pabellon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_titulo_pabellon.setText("Pabellón:");
        jl_titulo_pabellon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound_aula.add(jl_titulo_pabellon, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, 50, 20));

        jl_numero_campus.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jl_numero_campus.setForeground(new java.awt.Color(41, 61, 109));
        jl_numero_campus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_numero_campus.setText("NN");
        jl_numero_campus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound_aula.add(jl_numero_campus, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 20, 20));

        jl_numero_pabellon.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jl_numero_pabellon.setForeground(new java.awt.Color(41, 61, 109));
        jl_numero_pabellon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_numero_pabellon.setText("X");
        jl_numero_pabellon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound_aula.add(jl_numero_pabellon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 20, 20));

        jl_numero_aula.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jl_numero_aula.setForeground(new java.awt.Color(41, 61, 109));
        jl_numero_aula.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_numero_aula.setText("NNN");
        jl_numero_aula.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound_aula.add(jl_numero_aula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 40, 20));

        panelRound1.add(panelRound_aula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 120, 80));

        panelRound_evaluaciones.setBackground(new java.awt.Color(255, 255, 255));
        panelRound_evaluaciones.setRoundBottomLeft(20);
        panelRound_evaluaciones.setRoundBottomRight(20);
        panelRound_evaluaciones.setRoundTopLeft(20);
        panelRound_evaluaciones.setRoundTopRight(20);
        panelRound_evaluaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_titulo_campus1.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jl_titulo_campus1.setForeground(new java.awt.Color(41, 61, 109));
        jl_titulo_campus1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_titulo_campus1.setText("- lorem ipsum");
        jl_titulo_campus1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound_evaluaciones.add(jl_titulo_campus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 50, 160, 20));

        jl_titulo_campus2.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jl_titulo_campus2.setForeground(new java.awt.Color(41, 61, 109));
        jl_titulo_campus2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_titulo_campus2.setText("- lorem ipsum");
        jl_titulo_campus2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound_evaluaciones.add(jl_titulo_campus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 160, 20));

        jl_titulo_campus3.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jl_titulo_campus3.setForeground(new java.awt.Color(41, 61, 109));
        jl_titulo_campus3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_titulo_campus3.setText("- lorem ipsum");
        jl_titulo_campus3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound_evaluaciones.add(jl_titulo_campus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, 160, 20));

        panelRound1.add(panelRound_evaluaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 190, 80));

        jp_ultima_capa.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 440, 490));

        fondoCurveadoDegradado1.setRoundTopLeft(50);
        fondoCurveadoDegradado1.setRoundTopRight(50);
        fondoCurveadoDegradado1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jp_ultima_capa.add(fondoCurveadoDegradado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_ultima_capa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_ultima_capa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void setUpCursos(){
        jl_nombre_curso.setText(nombreCurso);
        jl_numero_creditos.setText(numeroCreditos);
        jl_numero_campus.setText(aula.getnCampus());
        jl_numero_pabellon.setText(aula.getnPabellon());
        jl_numero_aula.setText(aula.getnAula());
    }
            
    private void jb_retrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_retrocederActionPerformed
        // Crea una nueva instancia de Inicio con los datos originales
        ventanaCursos.setEstudiante(estudiante);
        ventanaCursos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_retrocederActionPerformed

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jb_salirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private MyContainers.FondoCurveadoDegradado fondoCurveadoDegradado1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton jb_retroceder;
    private javax.swing.JButton jb_salir;
    private javax.swing.JLabel jl_J;
    private javax.swing.JLabel jl_L;
    private javax.swing.JLabel jl_Ma;
    private javax.swing.JLabel jl_Mi;
    private javax.swing.JLabel jl_S;
    private javax.swing.JLabel jl_V;
    private javax.swing.JLabel jl_cursos_titulo;
    private javax.swing.JLabel jl_hora_curso1;
    private javax.swing.JLabel jl_nombre_curso;
    private javax.swing.JLabel jl_numero_aula;
    private javax.swing.JLabel jl_numero_campus;
    private javax.swing.JLabel jl_numero_ciclo;
    private javax.swing.JLabel jl_numero_creditos;
    private javax.swing.JLabel jl_numero_pabellon;
    private javax.swing.JLabel jl_numero_veces_cursado;
    private javax.swing.JLabel jl_periodo;
    private javax.swing.JLabel jl_titulo_aula;
    private javax.swing.JLabel jl_titulo_campus;
    private javax.swing.JLabel jl_titulo_campus1;
    private javax.swing.JLabel jl_titulo_campus2;
    private javax.swing.JLabel jl_titulo_campus3;
    private javax.swing.JLabel jl_titulo_cilo1;
    private javax.swing.JLabel jl_titulo_creditos;
    private javax.swing.JLabel jl_titulo_cursado;
    private javax.swing.JLabel jl_titulo_evaluaciones;
    private javax.swing.JLabel jl_titulo_horario;
    private javax.swing.JLabel jl_titulo_lugar_aula;
    private javax.swing.JLabel jl_titulo_ndeveces;
    private javax.swing.JLabel jl_titulo_pabellon;
    private javax.swing.JLabel jl_titulo_pertenece;
    private javax.swing.JPanel jp_ultima_capa;
    private javax.swing.JLabel logo_reloj;
    private MyContainers.PanelRound panelRound1;
    private MyContainers.PanelRound panelRound10;
    private MyContainers.PanelRound panelRound6;
    private MyContainers.PanelRound panelRound7;
    private MyContainers.PanelRound panelRound8;
    private MyContainers.PanelRound panelRound9;
    private MyContainers.PanelRound panelRound_S;
    private MyContainers.PanelRound panelRound_aula;
    private MyContainers.PanelRound panelRound_evaluaciones;
    private MyContainers.PanelRound panelRound_horario;
    private MyContainers.PanelRound panelRound_periodo;
    // End of variables declaration//GEN-END:variables
}
