package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	@Column(name = "ans_id")
	private int ansId;
	
	private String answer;
	
	@OneToOne(mappedBy = "ans")
	private Question que;

	public Question getQue() {
		return que;
	}

	public void setQue(Question que) {
		this.que = que;
	}

	public int getAnsId() {
		return ansId;
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int ansId, String answer) {
		super();
		this.ansId = ansId;
		this.answer = answer;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
