package pl.dziadekprzemek.dziadek.web.domain.frontend;

import java.io.Serializable;

public class FeedbackPojo implements Serializable {

	private static final long serialVersionUID = 1L;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	private String email;
	private String firstName;
	private String lastName;
	private String feedback;

	@Override
	public String toString() {
		final StringBuilder stringBuilder = new StringBuilder("FeedbackPojo{");
		stringBuilder.append("email=").append(email).append('\'');
		stringBuilder.append("firstName=").append(firstName).append('\'');
		stringBuilder.append("lastName=").append(lastName).append('\'');
		stringBuilder.append("feedback=").append(feedback).append('\'');
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
}
