import java.time.LocalDateTime;


public class Vote {
	private Politician political;
	private LocalDateTime voteDate;

	public Vote(Politician political) {
		this.political = political;
		voteDate = LocalDateTime.now();
	}

	public Politician getPolitical() {
		return political;
	}

	public LocalDateTime getVoteDate() {
		return voteDate;
	}
}
