package jedi;

public enum JediRank {
    YOUNGLING(1, "YOUNGLING"),
    INITIATE(2, "INITIATE"),
    PADAWAN(3, "PADAWAN"),
    KNIGHT_ASPIRANT(4, "KNIGHT_ASPIRANT"),
    KNIGHT(5, "KNIGHT"),
    MASTER(6, "MASTER"),
    BATTLE_MASTER(7, "BATTLE_MASTER"),
    GRAND_MASTER(8, "GRAND_MASTER");

    private final int rankNumber;
    private final String rankName;

    JediRank(int rankNumber, String rankName) {
        this.rankNumber = rankNumber;
        this.rankName = rankName;
    }

    public int getRankNumber() {
        return rankNumber;
    }
    public String getRankName() {
        return rankName;
    }
}
