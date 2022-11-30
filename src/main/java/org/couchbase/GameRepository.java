package org.couchbase;

public interface GameRepository {
    GameData getGameData(String dataLocation);
}
