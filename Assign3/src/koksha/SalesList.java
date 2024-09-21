package koksha;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class SalesList {

	private JFrame frame;
	private JTextField item;
	private JTextField cost;
	private JTextField quantity;
	private JTextField total;
    private JTextArea saleList;
    private JButton addBtn;
    private SalesSlip sale;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesList window = new SalesList();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SalesList() {
		sale = new SalesSlip();
		initialize();
		registerTapButtonEvent();
	}
	
	   private void registerTapButtonEvent() {
	        addBtn.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                executeList();
	            }
	        });
	    }
	   
	   /**
	    * Executes program and begins creating sales items
	    */
	   public void executeList() {
		   String nInp = item.getText();
           double cInp = Double.parseDouble(cost.getText());
           int qInp = Integer.parseInt(quantity.getText());

           SalesItem salesItem = new SalesItem(nInp, cInp, qInp);
           sale.addItem(salesItem);

           saleList.setText(sale.toString());
           total.setText(String.format("$%.2f", sale.getTotal()));

           item.setText("");
           cost.setText("");
           quantity.setText("");
	   }

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Sales List");
		title.setBounds(185, 6, 61, 16);
		frame.getContentPane().add(title);
		
		item = new JTextField();
		item.setBounds(79, 27, 231, 26);
		frame.getContentPane().add(item);
		item.setColumns(10);
		
		cost = new JTextField();
		cost.setColumns(10);
		cost.setBounds(79, 65, 130, 26);
		frame.getContentPane().add(cost);
		
		quantity = new JTextField();
		quantity.setColumns(10);
		quantity.setBounds(79, 103, 130, 26);
		frame.getContentPane().add(quantity);
		
		JLabel itemLabel = new JLabel("Item:");
		itemLabel.setBounds(6, 32, 61, 16);
		frame.getContentPane().add(itemLabel);
		
		JLabel costLabel = new JLabel("Cost:");
		costLabel.setBounds(6, 70, 61, 16);
		frame.getContentPane().add(costLabel);
		
		JLabel quantLabel = new JLabel("Quantity:");
		quantLabel.setBounds(6, 108, 61, 16);
		frame.getContentPane().add(quantLabel);
		
		addBtn = new JButton("Add Item To List");
		addBtn.setBounds(79, 141, 136, 29);
		frame.getContentPane().add(addBtn);
		
		saleList = new JTextArea();
		saleList.setBounds(242, 79, 202, 187);
		frame.getContentPane().add(saleList);
		

		total = new JTextField();
		total.setBounds(48, 174, 130, 26);
		frame.getContentPane().add(total);
		total.setColumns(10);
		
		JLabel totalLabel = new JLabel("Total:");
		totalLabel.setBounds(6, 179, 61, 16);
		frame.getContentPane().add(totalLabel);
	}
}
