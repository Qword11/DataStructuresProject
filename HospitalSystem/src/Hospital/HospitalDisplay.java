package Hospital;

import Hospital.ClientInfo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;

public class HospitalDisplay extends Composite implements ActionListener{
	public Text TypeAge;
	public Text TypeName;

	public HospitalDisplay(Composite parent, int style) {
		super(parent, SWT.BORDER);
		setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		setLayout(null);
		 
		TypeAge = new Text(this, SWT.BORDER);
		TypeAge.setBounds(205, 270, 147, 19);
		TypeAge.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		TypeAge.setText("Age");
		
		
		
		//	Display display = new Display();
		//	Shell shell = new Shell(display);
		//	shell.setLayout(new GridLayout(1, false));
		//	DirectoryDisplay GUI = new DirectoryDisplay(shell, SWT.NONE);
			

		//	shell.pack();
		//	shell.open();
		//	while (!shell.isDisposed()) {
		//		if (!display.readAndDispatch())
		//			display.sleep();
		//	}
		//	display.dispose();
		//}
		
		
		
		
		Label lblNowServing = new Label(this, SWT.NONE);
		lblNowServing.setBounds(232, 56, 94, 27);
		lblNowServing.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 14, SWT.NORMAL));
		lblNowServing.setText("Now Serving:");
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setBounds(140, 248, 59, 14);
		lblNewLabel.setText("Sign-in:");
		
		
		
		StyledText styledText = new StyledText(this, SWT.BORDER);
		styledText.setBounds(237, 89, 83, 73);
		styledText.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 80, SWT.NORMAL));
		styledText.setText("#");
		styledText.setAlignment(SWT.CENTER);
		
		Label lblJohnDoe = new Label(this, SWT.NONE);
		lblJohnDoe.setBounds(10, 349, 164, 19);
		lblJohnDoe.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 14, SWT.NORMAL));
		lblJohnDoe.setText("Estimated Waiting Time: ");
		
		Button btnSignin = new Button(this, SWT.NONE);
		btnSignin.setBounds(358, 242, 94, 27);
		btnSignin.setText("Sign-In");
		
		
		
		TypeName = new Text(this, SWT.BORDER);
		TypeName.setBounds(205, 245, 147, 19);
		TypeName.setText("Name");
		TypeName.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		
		Label label = new Label(this, SWT.NONE);
		label.setBounds(240, 168, 78, 19);
		label.setText("servingName");
		label.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 14, SWT.NORMAL));
		
		Button DirectoryButton = new Button(this, SWT.NONE);
		DirectoryButton.setBounds(10, 10, 115, 27);
		DirectoryButton.setText("Directory");
		//DirectoryButton.add
		

		

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
