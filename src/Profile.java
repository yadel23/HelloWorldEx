import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Profile {
	private String _firstname, _lastname, _email, _major, _DOB;

	public Profile() {
		File profileFile = new File("src/profile.txt");
		Scanner fileInput;
		try {
			fileInput = new Scanner(profileFile);
			_firstname = fileInput.nextLine();
			_lastname = fileInput.nextLine();
			_email = fileInput.nextLine();
			_major = fileInput.nextLine();
			_DOB = fileInput.nextLine();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			System.out.println("file not found");
		}
	}

	public String getFirstName() {
		return _firstname;
	}

	public void setFirstName(String _firstname) {
		this._firstname = _firstname;
	}

	public String getLastName() {
		return _lastname;
	}

	public void setLastName(String _lastname) {
		this._lastname = _lastname;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String _email) {
		this._email = _email;
	}

	public String getMajor() {
		return _major;
	}

	public void setMajor(String _major) {
		this._major = _major;
	}

	public String getDOB() {
		return _DOB;
	}

	public void setDOB(String _DOB) {
		this._DOB = _DOB;
	}

	public void ViewProfile() {
		System.out.println(_firstname);
		System.out.println(_lastname);
		System.out.println(_email);
		System.out.println(_major);
		System.out.println(_DOB);

	}

}
