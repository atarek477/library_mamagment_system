package frontend;

import backend.Book;
import backend.LibrarianRole;
import backend.StudentBook;
import java.io.IOException;
import javax.swing.JFrame;

public class LibrarianRoleGui extends javax.swing.JFrame implements Node{

   private Node parent;
   private LibrarianRole librarianRole;
   private AddBook addBook;
   private TabelView tabelView;
   private BorrowBook borrowBook;
   private TabelView tabelViewBorrowedBooks;
   private ReturnBook returnBook;
   
   public LibrarianRoleGui() 
   {
       initComponents();
       librarianRole = new LibrarianRole();
       addBook=null;
       tabelView=null;
       borrowBook=null;
       tabelViewBorrowedBooks=null;
       returnBook=null;      
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonAddBook = new java.awt.Button();
        jButtonAddBook = new javax.swing.JButton();
        jButtonViewBooks = new javax.swing.JButton();
        jButtonBorrowBook = new javax.swing.JButton();
        jButtonViewBorrowedBooks = new javax.swing.JButton();
        jButtonReturnBook = new javax.swing.JButton();
        jButtonLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Librarian Role");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        buttonAddBook.setLabel("button1");
        buttonAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddBookActionPerformed(evt);
            }
        });

        jButtonAddBook.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAddBook.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButtonAddBook.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddBook.setText("Add Book");
        jButtonAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddBookActionPerformed(evt);
            }
        });

        jButtonViewBooks.setBackground(new java.awt.Color(0, 0, 0));
        jButtonViewBooks.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButtonViewBooks.setForeground(new java.awt.Color(255, 255, 255));
        jButtonViewBooks.setText("View Books");
        jButtonViewBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewBooksActionPerformed(evt);
            }
        });

        jButtonBorrowBook.setBackground(new java.awt.Color(0, 0, 0));
        jButtonBorrowBook.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButtonBorrowBook.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBorrowBook.setText("Borrow Book");
        jButtonBorrowBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrowBookActionPerformed(evt);
            }
        });

        jButtonViewBorrowedBooks.setBackground(new java.awt.Color(0, 0, 0));
        jButtonViewBorrowedBooks.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButtonViewBorrowedBooks.setForeground(new java.awt.Color(255, 255, 255));
        jButtonViewBorrowedBooks.setText("View Borrowed Books");
        jButtonViewBorrowedBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewBorrowedBooksActionPerformed(evt);
            }
        });

        jButtonReturnBook.setBackground(new java.awt.Color(0, 0, 0));
        jButtonReturnBook.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButtonReturnBook.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReturnBook.setText("Return Book");
        jButtonReturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnBookActionPerformed(evt);
            }
        });

        jButtonLogout.setBackground(new java.awt.Color(0, 0, 0));
        jButtonLogout.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButtonLogout.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogout.setText("Logout");
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel1.setText("    Librarian section");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(buttonAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonReturnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonViewBorrowedBooks)
                            .addComponent(jButtonBorrowBook, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonViewBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(buttonAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonViewBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBorrowBook, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonViewBorrowedBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonReturnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAddBookActionPerformed

    private void jButtonAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddBookActionPerformed
        if(addBook==null)
        {
            addBook=new AddBook(librarianRole);
            addBook.setParentNode(this);
        }
        addBook.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAddBookActionPerformed

    private void jButtonViewBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewBooksActionPerformed
        if (tabelView==null)
        {
           tabelView=new TabelView(new String[]{"BookId", "Title", "Author Name", "Publisher","No Of Copies"});
           tabelView.setTitle("View Books");
           tabelView.setParentNode(this);
        }
        this.setVisible(false);
         
        Book[]users=librarianRole.getListOfBooks();
        String[][] tabelData=new String [users.length][5];
        for(int i=0;i<users.length;i++)
        {
            tabelData[i]=users[i].lineRepresentation().split(",");     
        }
        tabelView.setData(tabelData);
        tabelView.setVisible(true);
    }//GEN-LAST:event_jButtonViewBooksActionPerformed

    private void jButtonViewBorrowedBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewBorrowedBooksActionPerformed
        // TODO add your handling code here:
       if (tabelViewBorrowedBooks==null)
        {
           tabelViewBorrowedBooks = new TabelView(new String[]{"Student Id", "Book Id", "Borrow Date"});
           tabelViewBorrowedBooks.setTitle("View Borrowed Books");
           tabelViewBorrowedBooks.setParentNode(this);
        }
         this.setVisible(false);
         StudentBook[]users=librarianRole.getListOfBorrowingOperations();
     
         String[][] tabelData=new String [users.length][3];
         
        for(int i=0;i<users.length;i++)
        {
            tabelData[i]=users[i].lineRepresentation().split(",");     
            //System.out.println(tabelData[i][0]+tabelData[i][1]+tabelData[i][2]+tabelData[i][3]+tabelData[i][4]);
        }
        tabelViewBorrowedBooks.setData(tabelData);
        tabelViewBorrowedBooks.setVisible(true);
    }//GEN-LAST:event_jButtonViewBorrowedBooksActionPerformed

    private void jButtonBorrowBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrowBookActionPerformed
      
        if(borrowBook==null)
        {
            borrowBook=new BorrowBook(librarianRole);
            borrowBook.setParentNode(this);
        }
        borrowBook.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonBorrowBookActionPerformed

    private void jButtonReturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnBookActionPerformed
        
        if(returnBook==null)
        {
          returnBook=new ReturnBook(librarianRole);
          returnBook.setParentNode(this);
        }
        returnBook.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonReturnBookActionPerformed

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        // TODO add your handling code here:
         try {
           librarianRole.logout();
       } catch (IOException ex) {
           java.util.logging.Logger.getLogger(LibrarianRoleGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }
        this.setVisible(false);
        ((JFrame)getParentNode()).setVisible(true);
    }//GEN-LAST:event_jButtonLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(LibrarianRoleGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianRoleGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianRoleGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianRoleGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarianRoleGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button buttonAddBook;
    private javax.swing.JButton jButtonAddBook;
    private javax.swing.JButton jButtonBorrowBook;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonReturnBook;
    private javax.swing.JButton jButtonViewBooks;
    private javax.swing.JButton jButtonViewBorrowedBooks;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public Node getParentNode() {
        return parent;
    }

    @Override
    public void setParentNode(Node node) {
        parent=node;
    }
}
