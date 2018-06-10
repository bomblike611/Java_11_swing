import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class OptionPaneEx extends JFrame {
	JButton inputBtn = new JButton("Input Name");		
	JTextField tf = new JTextField(15);
	JButton confirmBtn = new JButton("Confirm");		
	JButton messageBtn = new JButton("Message");
	
	OptionPaneEx() {
		setTitle("�ɼ� �� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		setSize(500,200);
		
		c.add(new MyPanel(), BorderLayout.NORTH);
		
		/*JPanel p=new JPanel();
		p.setBackground(Color.LIGHT_GRAY);
		p.add(inputBtn);
		p.add(confirmBtn);
		p.add(messageBtn);
		p.add(tf);
		Mylistner listner =new  Mylistner();
		inputBtn.addActionListener(listner);
		confirmBtn.addActionListener(listner);
		messageBtn.addActionListener(listner);
		 
		c.add(p, BorderLayout.NORTH);*/
		
		setVisible(true);
	 }
	
	class MyPanel extends Panel {
		
		MyPanel() {
			setBackground(Color.YELLOW);
			add(inputBtn);
			add(confirmBtn);
			add(messageBtn);
			add(tf);
			Mylistner listner =new  Mylistner();
			inputBtn.addActionListener(listner);
			confirmBtn.addActionListener(listner);
			messageBtn.addActionListener(listner);
			
			/*inputBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �Է� ���̾�α� ����
				String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���.");
				if(name != null)
					tf.setText(name); // ����ڰ� �Է��� ���ڿ��� �ؽ�Ʈ�ʵ� â�� ���
		 	 }
		   });

		  confirmBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ȯ�� ���̾�α� ����
				int result = JOptionPane.showConfirmDialog(null, 
						"����� ���Դϱ�?", "Confirm", JOptionPane.YES_NO_OPTION);
				
				// ����ڰ� ������ ��ư�� ���� ���ڿ��� �ؽ�Ʈ�ʵ� â�� ���
				if(result == JOptionPane.CLOSED_OPTION)
					tf.setText("Just Closed without Selection");
				else if(result == JOptionPane.YES_OPTION)
					tf.setText("Yes");
				else
					tf.setText("No");
			 }
		   });
		
		  messageBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �޽��� ���̾�α� ����					
				JOptionPane.showMessageDialog(null, "�����ϼ���", "Message", JOptionPane.ERROR_MESSAGE); 
		    	setTitle("����");
		    	tf.setText("����");
			  }
		   }); */
		   
		}
	}
		class Mylistner implements ActionListener {
			public void actionPerformed(ActionEvent e) {
			  String c=e.getActionCommand();
				switch(c){
					case "Input Name":
						String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���.","ȫ�浿");
						if(name != null)
							tf.setText(name); // ����ڰ� �Է��� ���ڿ��� �ؽ�Ʈ�ʵ� â�� ���
						 setTitle("�Է�...");
					    break;
					case "Confirm":	
					    int result = JOptionPane.showConfirmDialog(null, "����� ���Դϱ�?", "Confirm", JOptionPane.YES_NO_OPTION);//OK_CANCEL_OPTION);
					
					    // ����ڰ� ������ ��ư�� ���� ���ڿ��� �ؽ�Ʈ�ʵ� â�� ���
				        if(result == JOptionPane.CLOSED_OPTION)
					    	tf.setText("Just Closed without Selection");
					    else if(result == JOptionPane.YES_OPTION)
					    	tf.setText("Yes");
					    else
					    	tf.setText("No");
				        setTitle("Ȯ��");
				     	break;
					case "Message":
					    JOptionPane.showMessageDialog(null, "�����ϼ���", "Message", JOptionPane.WARNING_MESSAGE);//QUESTION_MESSAGE);//WARNING_MESSAGE);//INFORMATION_MESSAGE);//ERROR_MESSAGE); 
			    	    setTitle("����");
			    	    tf.setText("����");
			    	    break;
				   }
			    }
		      }
		


	public static void main(String [] args) {
		OptionPaneEx of=new OptionPaneEx();
	}
} 




