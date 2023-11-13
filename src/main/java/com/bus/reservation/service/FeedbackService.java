package com.bus.reservation.service;

import java.util.List;

import com.bus.reservation.exception.BusException;
import com.bus.reservation.exception.FeedBackException;
import com.bus.reservation.exception.UserException;
import com.bus.reservation.model.Feedback;


public interface FeedbackService {
	
	
	public Feedback addFeedBack(Feedback feedBack,Integer busId,String key) throws BusException, UserException;
	
	public Feedback updateFeedBack(Feedback feedback,String key) throws FeedBackException, UserException;
	
	public Feedback deleteFeedBack(Integer feedbackId, String key)throws FeedBackException,UserException;

	public Feedback viewFeedback(Integer id) throws FeedBackException;

	public List<Feedback> viewFeedbackAll() throws FeedBackException;
	
}
