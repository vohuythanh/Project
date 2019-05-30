
package game_project;


import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;


public class GUI extends javax.swing.JFrame {

   
    private demo2048_2 game;
      HighscoreManager hm = new HighscoreManager();// highscore
    //private Push_Stack pu = new Push_Stack();
    private JButton [][] array = new JButton[5][5]; 
    String name = "";
    public GUI() {
        initComponents();
        game = new demo2048_2();
        game.addnewcell();
        game.addnewcell();
        Best.setText("" + hm.getHighScore());
        assignBTtoArray();
        setDefaultText();
        name = JOptionPane.showInputDialog(this, "What's your name?");
        player.setText(name);
        view(game);
    }
    
    public void setDefaultText() {
        for(int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                array[i][j].setText(null);
            }
    }
    
    public void assignBTtoArray() {
        array[0][0] = arr1;
        array[0][1] = arr2;
        array[0][2] = arr3;
        array[0][3] = arr4;
        array[0][4] = arr5;
        array[1][0] = arr6;
        array[1][1] = arr7;
        array[1][2] = arr8;
        array[1][3] = arr9;
        array[1][4] = arr10;
        array[2][0] = arr11;
        array[2][1] = arr12;
        array[2][2] = arr13;
        array[2][3] = arr14;
        array[2][4] = arr15;
        array[3][0] = arr16;
        array[3][1] = arr17;
        array[3][2] = arr18;
        array[3][3] = arr19;
        array[3][4] = arr20;
        array[4][0] = arr21;
        array[4][1] = arr22;
        array[4][2] = arr23;   
        array[4][3] = arr24;
        array[4][4] = arr25;
    }
    public void view(demo2048_2 Obj) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(Obj.getValue(i,j) != 0) {
                    switch(Obj.getValue(i, j)) {
                        default : {
                            array[i][j].setText("" + Obj.getValue(i,j)); 
                            array[i][j].setBackground(new Color(255,0,51));
                            break;
                        }
                        case 2 : {
                            array[i][j].setText("" + Obj.getValue(i,j)); 
                            array[i][j].setBackground(new Color(255,255,255));
                            break;
                        }
                        case 4 : {
                           array[i][j].setText("" + Obj.getValue(i,j)); 
                           array[i][j].setBackground(new Color(255,229,204));
                            break;

                        }
                        case 8 : {
                           array[i][j].setText("" + Obj.getValue(i,j)); 
                           array[i][j].setBackground(new Color(255,153,51));
                           break;
                        }
                        case 16 : {
                            array[i][j].setText("" + Obj.getValue(i,j)); 
                            array[i][j].setBackground(new Color(255,102,102));
                           break;
                        }
                        case 32 : {
                           array[i][j].setText("" + Obj.getValue(i,j)); 
                           array[i][j].setBackground(new Color(255,51,51));
                           break;

                        }
                        case 64 : {
                           array[i][j].setText("" + Obj.getValue(i,j)); 
                           array[i][j].setBackground(new Color(255,0,0));
                           break;
                        }
                        case 128 : {
                            array[i][j].setText("" + Obj.getValue(i,j)); 
                            array[i][j].setBackground(new Color(255,255,102));
                            break;
                        }
                        case 256 : {
                           array[i][j].setText("" + Obj.getValue(i,j)); 
                           array[i][j].setBackground(new Color(255,255,51));
                           break;
                        }
                        case 512 : {
                           array[i][j].setText("" + Obj.getValue(i,j)); 
                           array[i][j].setBackground(new Color(255,255,0));
                           break;
                        }
                        case 1024 : {
                            array[i][j].setText("" + Obj.getValue(i,j)); 
                            array[i][j].setBackground(new Color(255,203,57));
                            break;
                        }
                        case 2048 : {
                           array[i][j].setText("" + Obj.getValue(i,j)); 
                           array[i][j].setBackground(new Color(255,183,57));
                           break;
                        }
                    }
                }
                else 
                {
                    array[i][j].setBackground(new Color(240,240,240));
                }
            }
        }
        Score.setText("" + game.getCurrentscore());
        //jButton1.setBackground();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        arr1 = new javax.swing.JButton();
        arr2 = new javax.swing.JButton();
        arr3 = new javax.swing.JButton();
        arr4 = new javax.swing.JButton();
        arr5 = new javax.swing.JButton();
        arr6 = new javax.swing.JButton();
        arr7 = new javax.swing.JButton();
        arr8 = new javax.swing.JButton();
        arr9 = new javax.swing.JButton();
        arr10 = new javax.swing.JButton();
        arr11 = new javax.swing.JButton();
        arr12 = new javax.swing.JButton();
        arr13 = new javax.swing.JButton();
        arr14 = new javax.swing.JButton();
        arr15 = new javax.swing.JButton();
        arr16 = new javax.swing.JButton();
        arr17 = new javax.swing.JButton();
        arr18 = new javax.swing.JButton();
        arr19 = new javax.swing.JButton();
        arr20 = new javax.swing.JButton();
        arr21 = new javax.swing.JButton();
        arr22 = new javax.swing.JButton();
        arr23 = new javax.swing.JButton();
        arr24 = new javax.swing.JButton();
        arr25 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Score = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Best = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        player = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        arr1.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N
        arr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arr1ActionPerformed(evt);
            }
        });

        arr2.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N
        arr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arr2ActionPerformed(evt);
            }
        });

        arr3.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N
        arr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arr3ActionPerformed(evt);
            }
        });

        arr4.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N
        arr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arr4ActionPerformed(evt);
            }
        });

        arr5.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N

        arr6.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N

        arr7.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N
        arr7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arr7ActionPerformed(evt);
            }
        });

        arr8.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N

        arr9.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N
        arr9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arr9ActionPerformed(evt);
            }
        });

        arr10.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N

        arr11.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N

        arr12.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N

        arr13.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N

        arr14.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N

        arr15.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N

        arr16.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N
        arr16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arr16ActionPerformed(evt);
            }
        });

        arr17.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N
        arr17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arr17ActionPerformed(evt);
            }
        });

        arr18.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N
        arr18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arr18ActionPerformed(evt);
            }
        });

        arr19.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N
        arr19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arr19ActionPerformed(evt);
            }
        });

        arr20.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N
        arr20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arr20ActionPerformed(evt);
            }
        });

        arr21.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N
        arr21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arr21ActionPerformed(evt);
            }
        });

        arr22.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N
        arr22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arr22ActionPerformed(evt);
            }
        });

        arr23.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N
        arr23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arr23ActionPerformed(evt);
            }
        });

        arr24.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N
        arr24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arr24ActionPerformed(evt);
            }
        });

        arr25.setFont(new java.awt.Font("Vinhan", 0, 23)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arr1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arr6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arr11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arr7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arr8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arr9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arr10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(arr16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(arr2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(arr12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(arr3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(arr13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(arr17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(arr18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(arr21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(arr22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(arr23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(arr14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(arr15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(arr19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(arr20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(arr24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(arr25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(384, 384, 384))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(arr4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(arr5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(arr1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addComponent(arr2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(arr3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(arr5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arr6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arr7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arr8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arr10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(arr4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arr9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(arr11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arr16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arr12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arr13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(arr17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arr18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arr14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arr15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arr20, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arr19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(arr21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(arr22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(arr23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(arr24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(arr25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Score", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("VNI-Chancery", 0, 30), new java.awt.Color(255, 255, 255))); // NOI18N

        Score.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Score.setForeground(new java.awt.Color(255, 255, 255));
        Score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Score.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Score, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(Score)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Best", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("VNI-Chancery", 0, 30), new java.awt.Color(255, 255, 255))); // NOI18N

        Best.setBackground(new java.awt.Color(0, 0, 0));
        Best.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Best.setForeground(new java.awt.Color(255, 255, 255));
        Best.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Best.setText("0");
        Best.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Best, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(Best, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Play-Mode-Repeat-All-Disabled-icon.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(365, 309));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        player.setBackground(new java.awt.Color(0, 102, 102));
        player.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        player.setForeground(new java.awt.Color(255, 255, 255));
        player.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        player.setText("ha lan");
        player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerActionPerformed(evt);
            }
        });

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("VNI-Chancery", 0, 30)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setName("Player"); // NOI18N
        label1.setText("Player :");

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/play-icon.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(player)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(252, 252, 252))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(354, 354, 354)))))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(player)
                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_UP){
            game.moveup();
        }else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            game.movedown();
        }else if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
            game.moveright();
        }else if(evt.getKeyCode() == KeyEvent.VK_LEFT){
            game.moveleft();
            
        }
      
      
       if(!game.notchaged())
            game.addnewcell();
            game.pushBoardToStack(game.board);  
        setDefaultText();
        view(game);       
        Best.setText("" + hm.getHighScore());
        
        if(game.gameover()) {    
        hm.addScore(name, game.getCurrentscore());
        JOptionPane.showMessageDialog(this,"LEADER BOARD\n"+hm.getHighscoreString());
        player.setText("   ");
        GameOver gameover = new GameOver();
        gameover.setVisible(true);
        gameover.requestFocus();
        gameover.toFront();
        this.dispose();
        }
    }//GEN-LAST:event_formKeyPressed

    private void BestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BestActionPerformed

    private void arr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arr2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arr2ActionPerformed

    private void arr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arr1ActionPerformed

    private void playerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playerActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        GUI GUI = new GUI();
        GUI.setVisible(true);
        GUI.requestFocus();
        GUI.toFront();
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // jPanel4.setFocusable(true);
        game.undo();
        game.setCurrentscore((int) (game.currentscore * 0.8));
        setDefaultText();
        view(game);
        /* if(game.stack_board.size() > 1)
        {
            jButton1.setBackground(new java.awt.Color(255, 102, 0));
            jButton1.setEnabled(true);
            jButton1.setVisible(true);
        }
        */
        if(game.stack_board.size() <= 1) { JOptionPane.showMessageDialog(this,"Can't undo ");
            //jButton1.setEnabled(false);
            //jButton1.setBackground(Color.WHITE);
        }

        // jPanel4.setFocusable(false);
        jPanel2.setFocusable(true);
        requestFocus();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void arr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arr3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arr3ActionPerformed

    private void arr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arr4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arr4ActionPerformed

    private void arr16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arr16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arr16ActionPerformed

    private void arr17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arr17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arr17ActionPerformed

    private void arr18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arr18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arr18ActionPerformed

    private void arr19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arr19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arr19ActionPerformed

    private void arr20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arr20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arr20ActionPerformed

    private void arr21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arr21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arr21ActionPerformed

    private void arr22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arr22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arr22ActionPerformed

    private void arr23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arr23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arr23ActionPerformed

    private void arr24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arr24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arr24ActionPerformed

    private void arr7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arr7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arr7ActionPerformed

    private void arr9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arr9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arr9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the  form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Best;
    private javax.swing.JLabel Score;
    private javax.swing.JButton arr1;
    private javax.swing.JButton arr10;
    private javax.swing.JButton arr11;
    private javax.swing.JButton arr12;
    private javax.swing.JButton arr13;
    private javax.swing.JButton arr14;
    private javax.swing.JButton arr15;
    private javax.swing.JButton arr16;
    private javax.swing.JButton arr17;
    private javax.swing.JButton arr18;
    private javax.swing.JButton arr19;
    private javax.swing.JButton arr2;
    private javax.swing.JButton arr20;
    private javax.swing.JButton arr21;
    private javax.swing.JButton arr22;
    private javax.swing.JButton arr23;
    private javax.swing.JButton arr24;
    private javax.swing.JButton arr25;
    private javax.swing.JButton arr3;
    private javax.swing.JButton arr4;
    private javax.swing.JButton arr5;
    private javax.swing.JButton arr6;
    private javax.swing.JButton arr7;
    private javax.swing.JButton arr8;
    private javax.swing.JButton arr9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private java.awt.Label label1;
    private javax.swing.JTextField player;
    // End of variables declaration//GEN-END:variables
 //To change body of generated methods, choose Tools | Templates.
    }
