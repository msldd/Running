package dao;

import java.util.List;

import entity.CardType;

public interface CardTypeDao {
	//鏌ヨ鎵�鏈�
	public List<CardType> findAll();
	//澧炲姞鏂扮殑绫诲瀷鍗�
	public int addNewCard(CardType ct);
	//鏇存敼鍗＄被鍨嬪唴瀹�
	public int updateCardType(CardType ct);
}
