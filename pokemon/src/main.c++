

// Path: pokemon\pokemon.cpp

// Path: pokemon\pokemon.h

#include <iostream>
#include <string>

class Pokemon
{

private:
    std::string name;
    int level;
    int hp;

int main(int argc, char const *argv[])
{
    /* code */
    return 0;
}

String getName()
{
    return name;

};

int getLevel()
{
    return level;
};

int getHp()
{
    return hp;
};

void setName(string name)
{
    this->name = name;
};

void setLevel(int level)
{
    this->level = level;
};

void setHp(int hp)
{
    this->hp = hp;
};

void pokemon(string name, int level, int hp)
{
    this->name = name;
    this->level = level;
    this->hp = hp;
};

void attack (Pokemon &enemy , int damage)
{
    if (enemy.hp <= 0)
    {
        cout << "Pokemon is already dead" << endl;
        return;

    }
    
    enemy.hp -= damage;
};






}