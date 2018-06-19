import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class GUI {
    

	public static void main(String[] args){
        
    	
        // create JFrame and JTables
    	JFrame frame = new JFrame("u1700007");
        JTable table = new JTable();
        
        
        // create a table and atributes
        Object[] columns = {"Product Name","Product Price","Stock Level"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        
        // set the model to the table
        table.setModel(model);
        
        
        // table Attributeds
        table.setBackground(Color.white);
        table.setForeground(Color.black);
        Font font = new Font("Ariel",23,22);
        table.setFont(font);
        table.setRowHeight(50);
        
        
        //JTextFields
        JTextField textName = new JTextField("Oranges");
        JTextField textPrice = new JTextField("2.1");
        JTextField textStock = new JTextField("300");
        
        
        //JButtons
        JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");  
        JButton btnSell = new JButton("Sell");
        JButton btnRestock = new JButton("Restock");
        
        
        textName.setBounds(20, 150, 100, 25);
        textPrice.setBounds(320, 150, 100, 25);
        textStock.setBounds(620, 150, 100, 25);
        
        
        btnAdd.setBounds(160, 150, 100, 25);
        btnUpdate.setBounds(760, 150, 100, 25);
        btnDelete.setBounds(160, 100, 100, 25);
        btnSell.setBounds(760,100,100,25);
        btnRestock.setBounds(760, 50, 100, 25);
        
        
        //JScrollPane
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 200, 880, 200);
        frame.setLayout(null);
        frame.add(pane);
        
        
        // Adds frames with variables
        frame.add(textName);
        frame.add(textPrice);
        frame.add(textStock);
    
        
        // add JButtons
        frame.add(btnAdd);
        frame.add(btnDelete);
        frame.add(btnUpdate);
        frame.add(btnSell);
        frame.add(btnRestock);
        
        
        // creates array to fill the rows
        Object[] row = new Object[3];
        
        //Default Bananas
        row[0] = "bananas";
        row[1] = 2.50;	
        row[2] = 25;

        model.addRow(row);
        
        
    	///Tutorial
        System.out.println("The left box delivers the name of the product. The middle, the price. The right, how much is stocked.");
        System.out.println("Selecting a product and pressing the delete button will eliminate the selected product.");
        System.out.println("Pressing the Add button with the Text Fields filled will create product.");
        System.out.println("Selecting a product and pressing the update button will change the product.");
        System.out.println("Warning; Untested on JCreator. Warning; Can not sell or restock NEW items. Default Bananas works!");

    	
        // button add row
        btnAdd.addActionListener(new ActionListener(){
        	
            @Override
            public void actionPerformed(ActionEvent e) {
             
                
                row[0] = textName.getText();
                row[1] = textPrice.getText();	
                row[2] = textStock.getText();
                
                
                // add row to the model
                model.addRow(row);
            }
        });
        
        
        // button remove row
        btnDelete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            
                // i = the index of the selected row
                int i = table.getSelectedRow();
                if(i >= 0){
                    // remove a row
                    model.removeRow(i);
                }
                else{
                    System.out.println("Delete Error");
                }
            }
        });
        

        // Shows the variables in program instead of hiding
        table.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseClicked(MouseEvent e){
            
            // i = the index of the selected row
            int i = table.getSelectedRow();
            
            textName.setText(model.getValueAt(i, 0).toString());
            textPrice.setText(model.getValueAt(i, 1).toString());
            textStock.setText(model.getValueAt(i, 2).toString());
            
        }
        });
        
        
        // button update row
        btnUpdate.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                // i = the index of the selected row
                int i = table.getSelectedRow();
                
                if(i >= 0) 
                {
                   model.setValueAt(textName.getText(), i, 0);
                   model.setValueAt(textPrice.getText(), i, 1);
                   model.setValueAt(textStock.getText(), i, 2);
                   	
                }
                
                else{
                    System.out.println("Update Error");
                }
            }
        });
        
        
     // salesmanship
        btnSell.addActionListener(new ActionListener(){
 
            public void actionPerformed(ActionEvent e) {
            	int i = table.getSelectedRow();
            	Object Temp1 = model.getValueAt(i, 2);
            	Integer price = (Integer)Temp1;
            	Object Temp2 = model.getValueAt(i, 1);
            	Double sell = (Double)Temp2;
            	Integer gain;
        	gain = new Integer((int) (price * sell));
        	System.out.println(gain);

        	}
        });
        
        
        // Restock
        btnRestock.addActionListener(new ActionListener(){
        	
            public void actionPerformed(ActionEvent e) {
            	int i = table.getSelectedRow();
            	
            	Object Temp1 = model.getValueAt(i, 2);
            	Integer Amounr = (Integer)Temp1;
            	String Temp2 = textStock.getText();
            	Integer Amount = Integer.parseInt(Temp2);
            	Integer h;
        	h = new Integer((int) (Amount + Amounr));
        	System.out.println(h);
        	model.setValueAt(h, i, 2);
        	}
        });
        


        	

        frame.setSize(900,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }


		
	
}