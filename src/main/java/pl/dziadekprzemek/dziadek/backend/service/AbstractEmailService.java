package pl.dziadekprzemek.dziadek.backend.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import pl.dziadekprzemek.dziadek.web.domain.frontend.FeedbackPojo;

public abstract class AbstractEmailService implements EmailService{

	@Value("${default.to.adress}")
	private String defaultToAdress;
	protected SimpleMailMessage prepareSimpleMailMessegeFromFeedbackPojo(FeedbackPojo feedbackPojo){
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(defaultToAdress);
		message.setFrom(feedbackPojo.getEmail());
		message.setSubject("Feedback received from"+feedbackPojo.getFirstName()+ " "+feedbackPojo.getLastName()+"! "+feedbackPojo);
		message.setText(feedbackPojo.getFeedback());
		return message;
	}

	@Override
	public void sendFeedbackEmail(FeedbackPojo feedbackPojo) {
		sendGenericEmailMessage(prepareSimpleMailMessegeFromFeedbackPojo(feedbackPojo));
	}
}
