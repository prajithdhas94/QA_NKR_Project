package pageObjectManager;

import com.utility.FileReaderManager;

import pageObjectModel.CareerPage;
import pageObjectModel.EducationPage;
import pageObjectModel.EmployementPage;
import pageObjectModel.ITSkillPage;
import pageObjectModel.KeySkillsPage;
import pageObjectModel.Loginpage;
import pageObjectModel.LogoutPage;
import pageObjectModel.PersonalDetailsPage;
import pageObjectModel.ProfilePage;
import pageObjectModel.ProfileSummaryPage;
import pageObjectModel.ProjectPage;
import pageObjectModel.ResumeHeadlinePage;
import pageObjectModel.ResumeUploadPage;

public class PageObjectManager {
	
	private Loginpage loginpage;
	
	private FileReaderManager fileReader;
	
	private static PageObjectManager pageObjectManager;
	
	private ProfilePage profilepage;
	
	private ResumeUploadPage resumepage;
	
	private ResumeHeadlinePage headlinePage;
	
	private KeySkillsPage skillspage;
	
	private EmployementPage employementpage;
	
	private EducationPage educationpage;
	
	private ITSkillPage itskillpage;
	
	private ProjectPage projectpage;
	
	private ProfileSummaryPage summarypage;
	
	private CareerPage careerpage;
	
	private PersonalDetailsPage personaldetailspage;
	
	private LogoutPage logoutpage;
	
	public LogoutPage getLogoutpage() {
		if(logoutpage == null) {
			logoutpage = new LogoutPage();
		}
		return logoutpage;
	}

	public PersonalDetailsPage getPersonaldetailspage() {
		if(personaldetailspage == null) {
			personaldetailspage = new PersonalDetailsPage();
		}
		return personaldetailspage;
	}

	public CareerPage getCareerpage() {
		if(careerpage == null) {
			careerpage = new CareerPage();
		}
		return careerpage;
	}

	public ProfileSummaryPage getSummarypage() {
		if(summarypage == null) {
			summarypage = new ProfileSummaryPage();
		}
		return summarypage;
	}

	public ProjectPage getProjectpage() {
		if(projectpage == null) {
			projectpage = new ProjectPage();
		}
		return projectpage;
	}

	public ITSkillPage getItskillpage() {
		if(itskillpage == null) {
			itskillpage = new ITSkillPage();
		}
		return itskillpage;
	}

	public EducationPage getEducationpage() {
		if(educationpage == null) {
			educationpage = new EducationPage();
		}
		return educationpage;
	}

	public EmployementPage getEmployementpage() {
		if(employementpage == null) {
			employementpage = new EmployementPage();
		}
		return employementpage;
	}

	public KeySkillsPage getSkillspage() {
		if(skillspage == null) {
			skillspage = new KeySkillsPage();
		}
		return skillspage;
	}

	public ResumeHeadlinePage getHeadlinePage() {
		if(headlinePage == null) {
			headlinePage = new ResumeHeadlinePage();
		}
		return headlinePage;
	}

	public ProfilePage getProfilepage() {
		if(profilepage == null) {
			profilepage = new ProfilePage();
		}
		return profilepage;
	}

	public ResumeUploadPage getResumepage() {
		if(resumepage == null) {
			resumepage = new ResumeUploadPage();
		}
		return resumepage;
	}

	public Loginpage getLoginpage() {
		if(loginpage == null) {
			loginpage = new Loginpage();
		}
		return loginpage;
	}

	public FileReaderManager getFileReader() {
		if(fileReader == null) {
			fileReader = new FileReaderManager();
		}
		return fileReader;
	}

	public static PageObjectManager getPageObjectManager() {
		if(pageObjectManager == null) {
			pageObjectManager = new PageObjectManager();
		}
		return pageObjectManager;
	}

}
