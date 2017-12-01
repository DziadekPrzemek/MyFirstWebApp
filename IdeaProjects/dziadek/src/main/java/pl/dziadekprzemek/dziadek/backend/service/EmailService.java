package pl.dziadekprzemek.dziadek.backend.service;

import org.springframework.mail.SimpleMailMessage;
import pl.dziadekprzemek.dziadek.web.domain.frontend.FeedbackPojo;

public interface EmailService {
	public void sendFeedbackEmail(FeedbackPojo feedbackPojo);
	public void sendGenericEmailMessage(SimpleMailMessage message);
}
