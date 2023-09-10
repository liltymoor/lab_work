echo "This shell script will pass my lab1 :)"
mkdir lab0
cd lab0
mkdir camerupt4
cd camerupt4
touch combusken
mkdir pidgey
touch piplup
mkdir klinglang
mkdir joltik
mkdir bulbasaur
cd ..
mkdir cherubi1
cd cherubi1
touch archen
mkdir solosis
mkdir gabite
mkdir ampharos
mkdir kabutops
cd ..
mkdir ferrothorn3
cd ferrothorn3
touch machoke
touch wartortle
touch yamask
touch slowking
touch tirtouga
cd ..
touch koffing1
touch poliwag0
touch tortwig5

printf "Тип диеты 0mnivore" | cat > camerupt4/combusken
printf "Ходы Covet Dive Icy Wind\nMud-Slap Signal Beam Sleep Talk Snore Stealth Rock Water Pledge Water\nPulse" | cat > camerupt4/piplup
printf "Тип покемона ROCK FLYING" | cat > cherubi1/archen
printf "weigth=155.4\nheight=59.0 atk=10 def=7" | cat > ferrothorn3/machoke
printf "Живет Beach Freshwater\nOcean" | cat > ferrothorn3/wartortle
printf "Тип диеты Теrravore" | cat > ferrothorn3/yamask
printf "satk=10 sdef 11\nspd=3" | cat > ferrothorn3/slowking
printf "Развитые способности Swift Swim" | cat > ferrothorn3/tirtouga
printf "satk=6\nsdef 5 spd=4" | cat > koffing1
printf "Xoды Dive Defense Curl Double-Edge Endeavor\nHelping Hand Icy Wind Sleep Talk Snore Water Pulse" | cat > poliwag0
printf "Bullet Seed Earth Power Giga Drain Grass Pledge Iron Tail Mud-Slap Natural Gift Rock Climb Secret Power Seed Bomb Sleep Talk Snore Stealth Rock Superpower Synthesis Worry Seed" | cat > turtwig5

chmod u=rx,g=wx,o=rwx camerupt4
chmod u=r,g=r,o= camerupt4/combusken
chmod u=rwx,g=rx,o=wx camerupt4/pidgey
chmod 664 camerupt4/piplup
chmod 577 camerupt4/klinglang
chmod u=rwx,g=wx,o=wx camerupt4/joltik
chmod 333 camerupt4/bulbasaur

chmod u=wx,g=rw,o=wx cherubi1
chmod u=rw,g=wx,o=w cherubi1/archen
chmod 750 cherubi1/solosis
chmod u=rwx,g=rx,o=w cherubi1/gabite
chmod u=rx,g=x,o=w cherubi1/ampharos
chmod 750 cherubi1/kabutops


chmod u=rx,g=w,o=r ferrothorn3
chmod 060 ferrothorn3/machoke
chmod 444 ferrothorn3/wartortle
chmod 046 ferrothorn3/yamask
chmod 006 ferrothorn3/slowking
chmod 006 ferrothorn3/tirtouga

chmod 440 koffing1
chmod 440 poliwag0
chmod 622 tortwig5

cat poliwag0 > ferrothorn3/machokepoliwag
cp poliwag0 camerupt4/pidgey
rsync -rR cherubi1 cherubi1/gabite
ln -s cherubi1 Copy_97
ln poliwag0 camerupt4/pipluppoliwag
cat "ferrothorn3/wartortle" "ferrothorn3/machoke" > koffing1_18
ln -s turtwig5 ferrothorn3/yamaskturtwig

mkdir tmp
chmod 777 tmp

wc -c poliwag0 | cat >> tmp/poliwag_wcResult
ls -R -laSr | tail -n4 | grep '^a'
cat -b poliwag0 2> > tmp/errors | grep -i 'e$'

wc -c turtwig5 | cat >> turtwig5
ls -lrat *ga*


rm koffing1
rm cherubi1/archen
rm Copy_*
rm camerupt4/pipluppoliw*
rm -r camerupt4
rmdir cherubi1/solosis



