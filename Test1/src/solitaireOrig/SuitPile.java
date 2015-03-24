package solitaireOrig;

class SuitPile extends CardPile {

	SuitPile(final int x, final int y) {
		super(x, y);
	}

	@Override
	public boolean canTake(final Card aCard) {
		if (empty()) { //пуста ли стопка?
			return aCard.isAce();
		}
		Card topCard = top(); //top() возвращает ссылку на верхнюю карту
		return (aCard.getSuit() == topCard.getSuit()) //совпадает по масти?
				&& (aCard.getRank() == 1 + topCard.getRank()); //на уровень выше по старшинству?
	}
}