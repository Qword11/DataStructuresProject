package Hospital;

import Hospital.ClientInfo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import java.util.Scanner;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.List;

public class DirectoryDisplay extends Composite {
	public Text TypeAge;
	public Text TypeName;

	public DirectoryDisplay(Composite parent, int style) {
		super(parent, SWT.BORDER);
		setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		setLayout(null);
		 
		
	}


	@Override
	protected void checkSubclass() {
		
	}
}
