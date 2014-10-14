package com.onekr.designmodel.state;

/**
 * 具体状态类——重复投票
 * 
 * @author Administrator
 *
 */
public class RepeatVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		// 重复投票，暂时不做处理
		System.out.println("请不要重复投票");
	}

}
