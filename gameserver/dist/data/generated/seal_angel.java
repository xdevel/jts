package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class seal_angel extends warrior_aggressive_casting_3skill_approach_revival {
	protected void MY_DYING(HandlerParam always_list, HandlerParam c0, HandlerParam c1, HandlerParam c2, HandlerParam code_info, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i9, HandlerParam last_attacker, HandlerParam lparty, HandlerParam member, HandlerParam random1_list, HandlerParam target) {
always_list = gg.AllocCodeInfoList();
random1_list = gg.AllocCodeInfoList();
target = last_attacker;
if (gg.HaveMemo(target, 234) == 1 && gg.GetMemoState(target, 234) == 8 && gg.OwnItemCount(target, 14362) > 0) {
random1_list.SetInfo(0, target);

}
if (gg.HaveMemo(target, 234) == 1 && gg.GetMemoState(target, 234) == 8 && gg.OwnItemCount(target, 14362) > 0) {
random1_list.SetInfo(0, target);

}
if (gg.IsNull(lparty) == 0) {
for (i9 = 0; i9 < lparty.member_count; i9 = i9 + 1) {
target = myself.GetMemberOfParty(lparty, i9);
if (gg.HaveMemo(target, 234) == 1 && gg.GetMemoState(target, 234) == 8 && gg.OwnItemCount(target, 14362) > 0) {
random1_list.SetInfo(0, target);

}

}

}
target = last_attacker;
if (gg.HaveMemo(target, 350) == 1) {
random1_list.SetInfo(1, target);

}
target = last_attacker;
always_list.SetInfo(2, target);
while (gg.IsNull(code_info = always_list.Next()) == 0) {
switch (code_info.code) {
case 2: {
myself.SetCurrentQuestID(348);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
c1 = myself.GetLastAttacker();
if (c1.master) {
c1 = c1.master;

}
i1 = gg.Party_GetCount(c1);
i2 = 0;
if (i1 == 0) {
if (gg.HaveMemo(c1, 348) && gg.GetMemoStateEx(c1, 348, 0) == 17 && gg.OwnItemCount(c1, 4294) > 0) {
c2 = c1;

}

} else {
for (i0 = 0; i0 < i1; i0 = i0 + 1) {
c0 = gg.Party_GetCreature(c1, i0);
if (gg.HaveMemo(c0, 348) && gg.GetMemoStateEx(c0, 348, 0) == 17 && gg.OwnItemCount(c0, 4294) > 0) {
i3 = gg.Rand(1000);
if (i2 <= i3) {
i2 = i3;
c2 = c0;

}

}

}

}
if (myself.IsNullCreature(c2) == 0 && myself.DistFromMe(c2) <= 1500) {
if (myself.GetCurrentTick() - c2.quest_last_reward_time > 1) {
c2.quest_last_reward_time = myself.GetCurrentTick();
i0 = gg.GetMemoStateEx(c2, 348, 1);
i0 = i0 + gg.Rand(100) + 100;
myself.SetMemoStateEx(c2, 348, 1, i0);
if (gg.GetMemoStateEx(c2, 348, 1) + i0 > 750) {
myself.GiveItem1(c2, 4295, 1);
myself.DeleteItem1(c2, 4294, 1);
myself.SoundEffect(c2, "ItemSound.quest_middle");
myself.SetMemoStateEx(c2, 348, 1, 0);

}

}

}

}
break;

}

}

}
code_info = random1_list.RandomSelectOne();
if (gg.IsNull(code_info) == 0) {
switch (code_info.code) {
case 0: {
myself.SetCurrentQuestID(234);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
myself.GiveItem1(target, 14361, 1);
myself.DeleteItem1(target, 14362, 1);
if (gg.OwnItemCount(target, 14361) >= 29) {
myself.SetFlagJournal(target, 234, 9);
myself.ShowQuestMark(target, 234);
myself.SoundEffect(target, "ItemSound.quest_middle");

} else {
myself.SoundEffect(target, "ItemSound.quest_itemget");

}

}
break;

}
case 1: {
myself.SetCurrentQuestID(350);
target = code_info.RandomSelectOne();
if (gg.IsNull(target) == 0 && myself.DistFromMe(target) <= 1500) {
if (target == myself.c_quest0 && myself.i_quest0 == 2) {
if (gg.OwnItemCount(target, 4651) + gg.OwnItemCount(target, 4652) + gg.OwnItemCount(target, 4653) + gg.OwnItemCount(target, 4654) + gg.OwnItemCount(target, 4655) + gg.OwnItemCount(target, 4656) + gg.OwnItemCount(target, 4657) + gg.OwnItemCount(target, 4658) + gg.OwnItemCount(target, 4659) + gg.OwnItemCount(target, 4660) + gg.OwnItemCount(target, 4661) + gg.OwnItemCount(target, 5579) + gg.OwnItemCount(target, 5582) + gg.OwnItemCount(target, 5914) + gg.OwnItemCount(target, 4629) + gg.OwnItemCount(target, 4630) + gg.OwnItemCount(target, 4631) + gg.OwnItemCount(target, 4632) + gg.OwnItemCount(target, 4633) + gg.OwnItemCount(target, 4634) + gg.OwnItemCount(target, 4635) + gg.OwnItemCount(target, 4636) + gg.OwnItemCount(target, 4637) + gg.OwnItemCount(target, 4638) + gg.OwnItemCount(target, 4639) + gg.OwnItemCount(target, 5577) + gg.OwnItemCount(target, 5580) + gg.OwnItemCount(target, 5908) + gg.OwnItemCount(target, 4640) + gg.OwnItemCount(target, 4641) + gg.OwnItemCount(target, 4642) + gg.OwnItemCount(target, 4643) + gg.OwnItemCount(target, 4644) + gg.OwnItemCount(target, 4645) + gg.OwnItemCount(target, 4646) + gg.OwnItemCount(target, 4647) + gg.OwnItemCount(target, 4648) + gg.OwnItemCount(target, 4649) + gg.OwnItemCount(target, 4650) + gg.OwnItemCount(target, 5578) + gg.OwnItemCount(target, 5581) + gg.OwnItemCount(target, 5911) + gg.OwnItemCount(target, 9571) + gg.OwnItemCount(target, 10161) + gg.OwnItemCount(target, 9570) + gg.OwnItemCount(target, 10160) + gg.OwnItemCount(target, 9572) + gg.OwnItemCount(target, 10162) + gg.OwnItemCount(target, 10482) + gg.OwnItemCount(target, 10481) + gg.OwnItemCount(target, 10480) + gg.OwnItemCount(target, 13072) + gg.OwnItemCount(target, 13073) + gg.OwnItemCount(target, 13071) + gg.OwnItemCount(target, 15542) + gg.OwnItemCount(target, 15543) + gg.OwnItemCount(target, 15541) == 1) {
i0 = gg.Rand(100);
if (i0 <= 9) {
if (gg.OwnItemCount(target, 4651) == 1) {
myself.DeleteItem1(target, 4651, 1);
myself.GiveItem1(target, 4652, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4652) == 1) {
myself.DeleteItem1(target, 4652, 1);
myself.GiveItem1(target, 4653, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4653) == 1) {
myself.DeleteItem1(target, 4653, 1);
myself.GiveItem1(target, 4654, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4654) == 1) {
myself.DeleteItem1(target, 4654, 1);
myself.GiveItem1(target, 4655, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4655) == 1) {
myself.DeleteItem1(target, 4655, 1);
myself.GiveItem1(target, 4656, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4656) == 1) {
myself.DeleteItem1(target, 4656, 1);
myself.GiveItem1(target, 4657, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4657) == 1) {
myself.DeleteItem1(target, 4657, 1);
myself.GiveItem1(target, 4658, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4658) == 1) {
myself.DeleteItem1(target, 4658, 1);
myself.GiveItem1(target, 4659, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4659) == 1) {
myself.DeleteItem1(target, 4659, 1);
myself.GiveItem1(target, 4660, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4660) == 1) {
myself.DeleteItem1(target, 4660, 1);
myself.GiveItem1(target, 4661, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4629) == 1) {
myself.DeleteItem1(target, 4629, 1);
myself.GiveItem1(target, 4630, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4630) == 1) {
myself.DeleteItem1(target, 4630, 1);
myself.GiveItem1(target, 4631, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4631) == 1) {
myself.DeleteItem1(target, 4631, 1);
myself.GiveItem1(target, 4632, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4632) == 1) {
myself.DeleteItem1(target, 4632, 1);
myself.GiveItem1(target, 4633, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4633) == 1) {
myself.DeleteItem1(target, 4633, 1);
myself.GiveItem1(target, 4634, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4634) == 1) {
myself.DeleteItem1(target, 4634, 1);
myself.GiveItem1(target, 4635, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4635) == 1) {
myself.DeleteItem1(target, 4635, 1);
myself.GiveItem1(target, 4636, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4636) == 1) {
myself.DeleteItem1(target, 4636, 1);
myself.GiveItem1(target, 4637, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4637) == 1) {
myself.DeleteItem1(target, 4637, 1);
myself.GiveItem1(target, 4638, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4638) == 1) {
myself.DeleteItem1(target, 4638, 1);
myself.GiveItem1(target, 4639, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4640) == 1) {
myself.DeleteItem1(target, 4640, 1);
myself.GiveItem1(target, 4641, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4641) == 1) {
myself.DeleteItem1(target, 4641, 1);
myself.GiveItem1(target, 4642, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4642) == 1) {
myself.DeleteItem1(target, 4642, 1);
myself.GiveItem1(target, 4643, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4643) == 1) {
myself.DeleteItem1(target, 4643, 1);
myself.GiveItem1(target, 4644, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4644) == 1) {
myself.DeleteItem1(target, 4644, 1);
myself.GiveItem1(target, 4645, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4645) == 1) {
myself.DeleteItem1(target, 4645, 1);
myself.GiveItem1(target, 4646, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4646) == 1) {
myself.DeleteItem1(target, 4646, 1);
myself.GiveItem1(target, 4647, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4647) == 1) {
myself.DeleteItem1(target, 4647, 1);
myself.GiveItem1(target, 4648, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4648) == 1) {
myself.DeleteItem1(target, 4648, 1);
myself.GiveItem1(target, 4649, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else if (gg.OwnItemCount(target, 4649) == 1) {
myself.DeleteItem1(target, 4649, 1);
myself.GiveItem1(target, 4650, 1);
myself.SoundEffect(target, "ItemSound.quest_itemget");
myself.ShowSystemMessage(target, 974);

} else {
myself.ShowSystemMessage(target, 978);

}

} else {
myself.ShowSystemMessage(target, 975);

}

} else {
myself.ShowSystemMessage(target, 977);

}

}

}
break;

}

}

}
super;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam damage, HandlerParam skill_name_id) {
myself.SetCurrentQuestID(350);
switch (myself.i_quest0) {
case 0: {
myself.i_quest0 = 1;
if (skill_name_id / 65536 == 137363457 / 65536 && myself.sm.hp <= myself.sm.max_hp * 0.500000) {
myself.i_quest0 = 2;
myself.c_quest0 = attacker;

}
break;

}
case 1: {
if (skill_name_id / 65536 == 137363457 / 65536 && myself.sm.hp <= myself.sm.max_hp * 0.500000) {
myself.i_quest0 = 2;
myself.c_quest0 = attacker;

}
break;

}
case 2: {
break;

}

}
super;
	}


}