package DemoAfter;

public class MessageService {

	public String salutation(Title title) {
		SalutationContext context = new SalutationContext();
		return context.doExecute(title);
	}
}
