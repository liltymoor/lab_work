echo "This shell script will pass my lab1 :)"

echo "first part"

mkdir lab0
cd lab0

mkdir camerupt4
touch combusken piplup
mkdir -p camerupt4/pidgey camerupt4/klinglang camerupt4/joltik camerupt4/bulbasaur

mkdir cherubi1
touch archen
mkdir -p cherubi1/solosis cherubi1/gabite cherubi1/ampharos cherubi1/kabutops

mkdir ferrothorn3
touch ferrothorn3/machoke ferrothorn3/wartortle ferrothorn3/yamask ferrothorn3/slowking ferrothorn3/tirtouga

touch koffing1 poliwag0 tortwig5

echo -e "Тип диеты 0mnivore" | cat > camerupt4/combusken
echo -e "Ходы Covet Dive Icy Wind\nMud-Slap Signal Beam Sleep Talk Snore Stealth Rock Water Pledge Water\nPulse" | cat > camerupt4/piplup
echo -e "Тип покемона ROCK FLYING" | cat > cherubi1/archen
echo -e "weigth=155.4\nheight=59.0 atk=10 def=7" | cat > ferrothorn3/machoke
echo -e "Живет Beach Freshwater\nOcean" | cat > ferrothorn3/wartortle
echo -e "Тип диеты Теrravore" | cat > ferrothorn3/yamask
echo -e "satk=10 sdef 11\nspd=3" | cat > ferrothorn3/slowking
echo -e "Развитые способности Swift Swim" | cat > ferrothorn3/tirtouga
echo -e "satk=6\nsdef 5 spd=4" | cat > koffing1
echo -e "Xoды Dive Defense Curl Double-Edge Endeavor\nHelping Hand Icy Wind Sleep Talk Snore Water Pulse" | cat > poliwag0
echo -e "Bullet Seed Earth Power Giga Drain Grass Pledge Iron Tail Mud-Slap Natural Gift Rock Climb Secret Power Seed Bomb Sleep Talk Snore Stealth Rock Superpower Synthesis Worry Seed" | cat > turtwig5


echo "second part"

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

echo "third part"

# 3.1
chmod u+w ferrothorn3/
cat poliwag0 > ferrothorn3/machokepoliwag
chmod u-w ferrothorn3/

#3.2
cp poliwag0 camerupt4/pidgey

#3.3
mkdir TEMP
chmod u+r cherubi1
cp -r cherubi1 TEMP
chmod u-r cherubi1
mv TEMP/cherubi1 cherubi1/gabite
rmdir TEMP

#3.4
ln -s /home/studs/s413105/lab_work/lab0/cherubi1 Copy_97

#3.5
chmod u+w camerupt4/
ln poliwag0 camerupt4/pipluppoliwag
chmod u-w camerupt4/

#3.6
chmod u+r ferrothorn3/machoke
cat ferrothorn3/wartortle ferrothorn3/machoke > koffing1_18
chmod u-r ferrothorn3/machoke

#3.7
chmod u+w ferrothorn3/
ln -s /home/studs/s413105/lab_work/lab0/turtwig5 ferrothorn3/yamaskturtwig
chmod u-w ferrothorn3/

echo "fourth part"

#4.1
wc -c poliwag0 | cat > /tmp/poliwag_wcResult 2>/dev/null

#4.2
chmod u+r cherubi1
chmod u+r camerupt4/bulbasaur
ls -R -laSr | tail -n4 | grep '^a' # -n4 - 4 последние строки
chmod u-r cherubi1
chmod u-r camerupt4/bulbasaur

#4.3
cat -b poliwag0 2>> /tmp/errorrrs | grep -i 'e$' # cat -b вывод номеров строк; grep -i регистронезависимость

#4.4
wc -l $(ls **/*e | grep -v "/$") 2>/dev/null | sort -nrk1 | tail -n +2 # -n + 2 со второй до конца | sort -n (по номерам) r(рекурсивно/обратно) k1( по первому столбцу )

#4.5
wc -c turtwig5 | cat >> turtwig5

#4.6
ls -lrat '*ga*' | head -n 3

echo "fifth part"

chmod u+wx koffing1
rm koffing1
rm cherubi1/archen
rm Copy_*

chmod u+rwx camerupt4
chmod -R u+rwx camerupt4/*
rm camerupt4/pipluppoliw*
rm -r camerupt4
rmdir cherubi1/solosis


cd ..
chmod -R 777 lab0
rm -r lab0



