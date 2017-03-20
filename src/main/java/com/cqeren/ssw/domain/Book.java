/**
 * 
 */
package com.cqeren.ssw.domain;

import java.util.Date;

/**
 * @author Administrator
 *
 */
public class Book {

	private Long id;
	private String doubanId;
	private String title;
	private String url;
	private String description;
	private Long ownerId;
	private Date onboardDate;
	private String status;
	private Long borrowerId;
	private Date borrowDate;

	public Book(String doubanId, String title, String url) {
		this.doubanId = doubanId;
		this.title = title;
		this.url = url;
	}

	public Book(Long id, String doubanId, String title, String url, String description, Long ownerId, Date onboardDate,
			String status, Long borrowerId, Date borrowDate) {
		this.id = id;
		this.doubanId = doubanId;
		this.title = title;
		this.url = url;
		this.description = description;
		this.ownerId = ownerId;
		this.onboardDate = onboardDate;
		this.status = status;
		this.borrowerId = borrowerId;
		this.borrowDate = borrowDate;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the doubanId
	 */
	public String getDoubanId() {
		return doubanId;
	}

	/**
	 * @param doubanId
	 *            the doubanId to set
	 */
	public void setDoubanId(String doubanId) {
		this.doubanId = doubanId;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the ownerId
	 */
	public Long getOwnerId() {
		return ownerId;
	}

	/**
	 * @param ownerId
	 *            the ownerId to set
	 */
	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	/**
	 * @return the onboardDate
	 */
	public Date getOnboardDate() {
		return onboardDate;
	}

	/**
	 * @param onboardDate
	 *            the onboardDate to set
	 */
	public void setOnboardDate(Date onboardDate) {
		this.onboardDate = onboardDate;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the borrowerId
	 */
	public Long getBorrowerId() {
		return borrowerId;
	}

	/**
	 * @param borrowerId
	 *            the borrowerId to set
	 */
	public void setBorrowerId(Long borrowerId) {
		this.borrowerId = borrowerId;
	}

	/**
	 * @return the borrowDate
	 */
	public Date getBorrowDate() {
		return borrowDate;
	}

	/**
	 * @param borrowDate
	 *            the borrowDate to set
	 */
	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}

}
