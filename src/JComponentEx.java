import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComponentEx extends JFrame {
	JComponentEx() {
		super("JComponent�� ���� �޼ҵ� ����");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.MAGENTA);
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton("  Disabled Button  ");
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.YELLOW); // ���� ����
		b1.setForeground(Color.MAGENTA); // ���ڻ� ����
		b1.setFont(new Font("Arial", Font.ITALIC, 20)); // Arial, 20�ȼ� ��Ʈ ����
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (c.getBackground().equals(Color.MAGENTA)) c.setBackground(Color.YELLOW);
				else c.setBackground(Color.MAGENTA);
			}
		});
		b2.setEnabled(false); // ��ư ��Ȱ��ȭ
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				setTitle(b.getX() + "," + b.getY()); // Ÿ��Ʋ�� ��ư ��ǥ ���
				//setTitle(b.getLocationOnScreen().getX() + "," + b.getLocationOnScreen().getY()); // Ÿ��Ʋ�� ��ư ��ǥ ���
				
			}
		});
		
		c.add(b1); c.add(b2); c.add(b3); // ����Ʈ�ҿ� ��ư ����
		
		setSize(260,200); setVisible(true);
	}

	public static void main(String[] args) {
		new JComponentEx();
	}
}