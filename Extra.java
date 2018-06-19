import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;

// salesmanship
        btnSell.addActionListener(new ActionListener(){
        	Integer s = (Integer)row[2];
        	Integer k = (Integer)row[1];
        	Integer h;
        	@Override
            public void actionPerformed(ActionEvent e) {
        	h = new Integer(k * s);
        	rowlite[0] = h;
        	model.addRow(rowlite);
        	}
        });
        
        

        JScrollPane pana = new JScrollPane(Logger);
        pana.setBounds(600,25,100,50);
        

        frame.add(pana);
        
        // Restock
        btnRestock.addActionListener(new ActionListener(){
        	Integer s = (Integer)row[2];
        	Integer k = (Integer)row[1];
        	Integer h;
        	@Override
            public void actionPerformed(ActionEvent e) {
        	h = new Integer(k * s);
        	rowlite[0] = h;
        	model.addRow(rowlite);
        	}
        });
        
        
        // Restock
        btnRestock.addActionListener(new ActionListener(){
        	Integer s = textStock.getText();
        	Integer k = (Integer)row[1];
        	Integer h;
        	@Override
            public void actionPerformed(ActionEvent e) {
        	h = new Integer(k * s);
        	rowlite[0] = h;
        	model.addRow(rowlite);
        	}
        });
        
        String a = (String)row[2];
    	String b = (String)row[1];
    	int p = Integer.parseInt(a);
    	int s = Integer.parseInt(b);
    	
    	Integer s = (Integer)row[2];
    	Double a = (Double)row[1];
    	int p = ;
    	Integer g;
    	@Override
        public void actionPerformed(ActionEvent e) {
    	g = new Integer(p * s);
    	rowlite[0] = g;
    	model.addRow(rowlite);
    	
        // Restock
        btnRestock.addActionListener(new ActionListener(){
        	String Amounr = textStock.getText();
        	Double s = Double.parseDouble(Amounr);
        	Integer k = (Integer)row[1];
        	Integer h;
        	@Override
            public void actionPerformed(ActionEvent e) {
        	h = new Integer((int) (k * s));
        	System.out.println(h);
        	}
        });