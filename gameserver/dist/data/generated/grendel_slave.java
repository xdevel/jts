package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class grendel_slave extends warrior_ag_casting_enchant_1of4 {
	protected void MY_DYING(HandlerParam always_list, HandlerParam code_info, HandlerParam i4, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 602) == 1 && gg.GetMemoState(target, 602) == 1 * 10 + 1) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 602) == 1 && gg.GetMemoState(target, 602) == 1 * 10 + 1) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 602) == 1 && gg.GetMemoState(target, 602) == 1 * 10 + 1) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 603) == 1 && gg.GetMemoState(target, 603) == 7 * 10 + 1) {
random1_list.SetInfo(1, target);

}
if (gg.HaveMemo(target, 603) == 1 && gg.GetMemoState(target, 603) == 7 * 10 + 1) {
random1_list.SetInfo(1, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 603) == 1 && gg.GetMemoState(target, 603) == 7 * 10 + 1) {
random1_list.SetInfo(1, target);

}

}

}
while (gg.IsNull(code_info = always_list.Next()) == 0) {
code_info.code;

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(602);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 800) {
if (gg.OwnItemCount(target, 7189) + 1 >= 100) {
myself.GiveItem1(target, 7189, 100 - gg.OwnItemCount(target, 7189));
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 602, 2);
myself.ShowQuestMark(target, 602);
myself.SetMemoState(target, 602, 1 * 10 + 2);

} else {
myself.GiveItem1(target, 7189, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(603);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
i4 = gg.Rand(1000);
if (i4 < 673) {
if (gg.OwnItemCount(target, 7190) + 1 >= 200) {
if (gg.OwnItemCount(target, 7190) < 200) {
myself.GiveItem1(target, 7190, 200 - gg.OwnItemCount(target, 7190));
myself.SoundEffect(target, "ItemSound.quest_middle");
myself.SetFlagJournal(target, 603, 8);
myself.ShowQuestMark(target, 603);
myself.SetMemoState(target, 603, 7 * 10 + 2);

}

} else {
myself.GiveItem1(target, 7190, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}

}
break;

}

}

}
super;
	}


}