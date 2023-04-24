#include <iostream>
#include <string>


moveset 
{
private:
    std::string move;
    int damage;
    int accuracy;
    int pp;
    int maxpp;
    int type;
    int effect;
    int effectchance;
    
    void getmove()
    {
        return move;
    };

    void getdamage()
    {
        return damage;
    };

    void getaccuracy()
    {
        return accuracy;
    };

    void getpp()
    {
        return pp;
    };

    void getmaxpp()
    {
        return maxpp;
    };

    void gettype()
    {
        return type;
    };

    void getEffect()
    {
        return effect;
    };

    void getEffectChance()
    {
        return effectchance;
    };

    void setmove(std::string move)
    {
        this->move = move;
    };

    void setdamage(int damage)
    {
        this->damage = damage;
    };

    void setaccuracy(int accuracy)
    {
        this->accuracy = accuracy;
    };


    void setPP(int pp)
    {

        this->pp = pp;
    };

    void setMaxPP(int maxpp)
    {
        this->maxpp = maxpp;
    };

    void setType(int type)
    {
        this->type = type;
    };

    void setEffect(int effect)
    {
        this->effect = effect;
    };

    void setEffectChance(int effectchance)
    {
        this->effectchance = effectchance;
    };

    void moveset(std::string move, int damage, int accuracy, int pp, int maxpp, int type, int effect, int effectchance)
    {
        this->move = move;
        this->damage = damage;
        this->accuracy = accuracy;
        this->pp = pp;
        this->maxpp = maxpp;
        this->type = type;
        this->effect = effect;
        this->effectchance = effectchance;
    };


 


}