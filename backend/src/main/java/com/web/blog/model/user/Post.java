package com.web.blog.model.user;

import java.util.Date;

import com.web.blog.model.user.Board;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@ToString
@Entity (name="post")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Post {
	@Id
	private int id;
	
	private String subject;
	private String content;
	private Date created;
	private String uid;
	private String email;
	private String tag;
	private int hit;
	
	private int lnt;
	private int cnt;
	private boolean ilike;
	public Post(Board board, int lnt, int cnt, boolean ilike) {
		super();
		this.id = board.getId();
		this.subject = board.getSubject();
		this.content = board.getContent();
		this.created = board.getCreated();
		this.uid = board.getUid();
		this.email = board.getEmail();
		this.tag = board.getEmail();
		this.hit = board.getHit();
		this.lnt = lnt;
		this.cnt = cnt;
		this.ilike = ilike;
	}
	
	
	
}
