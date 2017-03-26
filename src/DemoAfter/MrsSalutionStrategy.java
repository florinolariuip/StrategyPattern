package DemoAfter;

public class MrsSalutionStrategy implements ISalutationStrategy {

	@Override
	public String salutation() {
		return "Hi " + Title.Mrs;
	}
}
