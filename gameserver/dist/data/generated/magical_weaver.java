package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class magical_weaver extends warrior_passive_casting_ddmagic {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c1, HandlerParam code_info, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
always_list.SetInfo(0, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(295);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
if (gg.HaveMemo(c1, 295) && gg.OwnItemCount(c1, 1492) < 50) {
if (gg.Rand(100) > 25) {
if (gg.OwnItemCount(c1, 1492) >= 49) {
myself.GiveItem1(c1, 1492, 1);
myself.SetFlagJournal(c1, 295, 2);
myself.ShowQuestMark(c1, 295);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.GiveItem1(c1, 1492, 1);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

} else if (gg.OwnItemCount(c1, 1492) >= 48) {
myself.GiveItem1(c1, 1492, 50 - gg.OwnItemCount(c1, 1492));
myself.SetFlagJournal(c1, 295, 2);
myself.ShowQuestMark(c1, 295);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.GiveItem1(c1, 1492, 2);
myself.SoundEffect(c1, "ItemSound.quest_itemget");

}

}

}
break;

}

}

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
code_info.code;

}
super;
	}


}