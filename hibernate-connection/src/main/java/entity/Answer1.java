package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import entity.Question1;

@Entity
public class Answer1 {
	@Id
	@Column(name = "ans_id")
	private int ansId;
	
	private String answer;
	
	@ManyToOne
	private Question1 que;

	public Question1 getQue() {
		return que;
	}

	public void setQue(Question1 que) {
		this.que = que;
	}

	public int getAnsId() {
		return ansId;
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}

	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer1(int ansId, String answer) {
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
