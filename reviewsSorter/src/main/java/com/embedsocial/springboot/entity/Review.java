package com.embedsocial.springboot.entity;

import java.time.OffsetDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {

	private long id;
	private String reviewID;
	private String reviewFullText;
	private String reviewText;
	private long numLikes;
	private long numComments;
	private long numShares;
	private long rating;
	private String reviewCreatedOn;
	private OffsetDateTime reviewCreatedOnDate;
	private long reviewCreatedOnTime;
	private Object reviewerID;
	private Object reviewerURL;
	private String reviewerName;
	private Object reviewerEmail;
	private String sourceType;
	private boolean isVerified;
	private String source;
	private String sourceName;
	private String sourceID;
	private Object[] tags;
	private Object href;
	private Object logoHref;
	private Object[] photos;

}
