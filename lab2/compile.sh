javac -d out/ -cp Pokemon.jar -sourcepath . src/*.java src/attacks/*.java src/pokemons/*.java
java -cp out/:Pokemon.jar  BattleConfig
