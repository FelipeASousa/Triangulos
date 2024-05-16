package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pessoa {
	private Integer id;
	private String name;
	private Integer age;
	private List<Email> emails;
	
	public List<Email> getEmails() {
		return emails;
	}
	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	private static final String EMAIL_PATTERN = 
	        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
	
	public List<String> isValidtoToInclude() {
		List<String> erros = new ArrayList<>();
		if (this.age <1 || this.age >= 200) {
			erros.add("A idade deve ser entar no intervalo de 1 a 200 anos");
		}
		
		if (this.emails.isEmpty()) {
			erros.add("A pessoa deve ter pelo menos um Email associado");
		}
		else {
			for (Email email : this.emails) {
				 Matcher matcher = pattern.matcher(email.getName());
				 if(matcher.matches() == false) {
					 erros.add("Email invalido");
				 }
				}
		}
		
		return erros;
	}
	
	
}
