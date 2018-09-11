package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

public final class GuildsOfRavnica extends ExpansionSet {

    private static final GuildsOfRavnica instance = new GuildsOfRavnica();

    public static GuildsOfRavnica getInstance() {
        return instance;
    }

    private GuildsOfRavnica() {
        super("Guilds of Ravnica", "GRN", ExpansionSet.buildDate(2018, 10, 5), SetType.EXPANSION);
        this.blockName = "Guilds of Ravnica";
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;

        cards.add(new SetCardInfo("Arboretum Elemental", 122, Rarity.UNCOMMON, mage.cards.a.ArboretumElemental.class));
        cards.add(new SetCardInfo("Artful Takedown", 151, Rarity.COMMON, mage.cards.a.ArtfulTakedown.class));
        cards.add(new SetCardInfo("Assassin's Trophy", 152, Rarity.RARE, mage.cards.a.AssassinsTrophy.class));
        cards.add(new SetCardInfo("Attendant of Vraska", 271, Rarity.UNCOMMON, mage.cards.a.AttendantOfVraska.class));
        cards.add(new SetCardInfo("Barging Sergeant", 92, Rarity.COMMON, mage.cards.b.BargingSergeant.class));
        cards.add(new SetCardInfo("Beast Whisperer", 123, Rarity.RARE, mage.cards.b.BeastWhisperer.class));
        cards.add(new SetCardInfo("Blade Instructor", 1, Rarity.COMMON, mage.cards.b.BladeInstructor.class));
        cards.add(new SetCardInfo("Boros Challenger", 156, Rarity.UNCOMMON, mage.cards.b.BorosChallenger.class));
        cards.add(new SetCardInfo("Boros Guildgate", 243, Rarity.COMMON, mage.cards.b.BorosGuildgate.class));
        cards.add(new SetCardInfo("Boros Guildgate", 244, Rarity.COMMON, mage.cards.b.BorosGuildgate.class));
        cards.add(new SetCardInfo("Bounty Agent", 2, Rarity.RARE, mage.cards.b.BountyAgent.class));
        cards.add(new SetCardInfo("Chemister's Insight", 32, Rarity.UNCOMMON, mage.cards.c.ChemistersInsight.class));
        cards.add(new SetCardInfo("Chromatic Lantern", 233, Rarity.RARE, mage.cards.c.ChromaticLantern.class));
        cards.add(new SetCardInfo("Conclave Tribunal", 6, Rarity.UNCOMMON, mage.cards.c.ConclaveTribunal.class));
        cards.add(new SetCardInfo("Deadly Visit", 68, Rarity.COMMON, mage.cards.d.DeadlyVisit.class));
        cards.add(new SetCardInfo("Deafening Clarion", 165, Rarity.RARE, mage.cards.d.DeafeningClarion.class));
        cards.add(new SetCardInfo("Dimir Guildgate", 245, Rarity.COMMON, mage.cards.d.DimirGuildgate.class));
        cards.add(new SetCardInfo("Dimir Guildgate", 246, Rarity.COMMON, mage.cards.d.DimirGuildgate.class));
        cards.add(new SetCardInfo("Dimir Informant", 36, Rarity.COMMON, mage.cards.d.DimirInformant.class));
        cards.add(new SetCardInfo("Direct Current", 96, Rarity.COMMON, mage.cards.d.DirectCurrent.class));
        cards.add(new SetCardInfo("District Guide", 128, Rarity.COMMON, mage.cards.d.DistrictGuide.class));
        cards.add(new SetCardInfo("Dream Eater", 38, Rarity.MYTHIC, mage.cards.d.DreamEater.class));
        cards.add(new SetCardInfo("Emmara, Soul of the Accord", 168, Rarity.RARE, mage.cards.e.EmmaraSoulOfTheAccord.class));
        cards.add(new SetCardInfo("Find // Finality", 225, Rarity.RARE, mage.cards.f.FindFinality.class));
        cards.add(new SetCardInfo("Firemind's Research", 171, Rarity.RARE, mage.cards.f.FiremindsResearch.class));
        cards.add(new SetCardInfo("Forest", 264, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Fresh-Faced Recruit", 216, Rarity.COMMON, mage.cards.f.FreshFacedRecruit.class));
        cards.add(new SetCardInfo("Gateway Plaza", 247, Rarity.COMMON, mage.cards.g.GatewayPlaza.class));
        cards.add(new SetCardInfo("Goblin Cratermaker", 103, Rarity.UNCOMMON, mage.cards.g.GoblinCratermaker.class));
        cards.add(new SetCardInfo("Goblin Electromancer", 174, Rarity.COMMON, mage.cards.g.GoblinElectromancer.class));
        cards.add(new SetCardInfo("Golgari Guildgate", 248, Rarity.COMMON, mage.cards.g.GolgariGuildgate.class));
        cards.add(new SetCardInfo("Golgari Guildgate", 249, Rarity.COMMON, mage.cards.g.GolgariGuildgate.class));
        cards.add(new SetCardInfo("Guild Summit", 41, Rarity.UNCOMMON, mage.cards.g.GuildSummit.class));
        cards.add(new SetCardInfo("Hammer Dropper", 176, Rarity.COMMON, mage.cards.h.HammerDropper.class));
        cards.add(new SetCardInfo("Healer's Hawk", 14, Rarity.COMMON, mage.cards.h.HealersHawk.class));
        cards.add(new SetCardInfo("Hypothesizzle", 178, Rarity.COMMON, mage.cards.h.Hypothesizzle.class));
        cards.add(new SetCardInfo("Impervious Greatwurm", 273, Rarity.MYTHIC, mage.cards.i.ImperviousGreatwurm.class));
        cards.add(new SetCardInfo("Ionize", 179, Rarity.RARE, mage.cards.i.Ionize.class));
        cards.add(new SetCardInfo("Island", 261, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Izoni, Thousand-Eyed", 180, Rarity.RARE, mage.cards.i.IzoniThousandEyed.class));
        cards.add(new SetCardInfo("Izzet Guildgate", 251, Rarity.COMMON, mage.cards.i.IzzetGuildgate.class));
        cards.add(new SetCardInfo("Izzet Guildgate", 252, Rarity.COMMON, mage.cards.i.IzzetGuildgate.class));
        cards.add(new SetCardInfo("Legion Warboss", 109, Rarity.RARE, mage.cards.l.LegionWarboss.class));
        cards.add(new SetCardInfo("March of the Multitudes", 188, Rarity.MYTHIC, mage.cards.m.MarchOfTheMultitudes.class));
        cards.add(new SetCardInfo("Moodmark Painter", 78, Rarity.COMMON, mage.cards.m.MoodmarkPainter.class));
        cards.add(new SetCardInfo("Mountain", 263, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Murmuring Mystic", 45, Rarity.UNCOMMON, mage.cards.m.MurmuringMystic.class));
        cards.add(new SetCardInfo("Narcomoeba", 47, Rarity.RARE, mage.cards.n.Narcomoeba.class));
        cards.add(new SetCardInfo("Necrotic Wound", 79, Rarity.UNCOMMON, mage.cards.n.NecroticWound.class));
        cards.add(new SetCardInfo("Nightveil Faerie", 48, Rarity.UNCOMMON, mage.cards.n.NightveilFaerie.class));
        cards.add(new SetCardInfo("Niv-Mizzet, Parun", 192, Rarity.RARE, mage.cards.n.NivMizzetParun.class));
        cards.add(new SetCardInfo("Nullhide Ferox", 138, Rarity.MYTHIC, mage.cards.n.NullhideFerox.class));
        cards.add(new SetCardInfo("Overgrown Tomb", 253, Rarity.RARE, mage.cards.o.OvergrownTomb.class));
        cards.add(new SetCardInfo("Plains", 260, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Quasiduplicate", 51, Rarity.RARE, mage.cards.q.Quasiduplicate.class));
        cards.add(new SetCardInfo("Radical Idea", 52, Rarity.COMMON, mage.cards.r.RadicalIdea.class));
        cards.add(new SetCardInfo("Ral's Dispersal", 266, Rarity.RARE, mage.cards.r.RalsDispersal.class));
        cards.add(new SetCardInfo("Ral's Staticaster", 268, Rarity.UNCOMMON, mage.cards.r.RalsStaticaster.class));
        cards.add(new SetCardInfo("Ral, Caller of Storms", 265, Rarity.MYTHIC, mage.cards.r.RalCallerOfStorms.class));
        cards.add(new SetCardInfo("Ral, Izzet Viceroy", 195, Rarity.MYTHIC, mage.cards.r.RalIzzetViceroy.class));
        cards.add(new SetCardInfo("Response // Resurgence", 229, Rarity.RARE, mage.cards.r.ResponseResurgence.class));
        cards.add(new SetCardInfo("Rosemane Centaur", 197, Rarity.COMMON, mage.cards.r.RosemaneCentaur.class));
        cards.add(new SetCardInfo("Runaway Steam-Kin", 115, Rarity.RARE, mage.cards.r.RunawaySteamKin.class));
        cards.add(new SetCardInfo("Sacred Foundry", 254, Rarity.RARE, mage.cards.s.SacredFoundry.class));
        cards.add(new SetCardInfo("Selesnya Guildgate", 255, Rarity.COMMON, mage.cards.s.SelesnyaGuildgate.class));
        cards.add(new SetCardInfo("Selesnya Guildgate", 256, Rarity.COMMON, mage.cards.s.SelesnyaGuildgate.class));
        cards.add(new SetCardInfo("Sinister Sabotage", 54, Rarity.UNCOMMON, mage.cards.s.SinisterSabotage.class));
        cards.add(new SetCardInfo("Sonic Assault", 199, Rarity.COMMON, mage.cards.s.SonicAssault.class));
        cards.add(new SetCardInfo("Status // Statue", 230, Rarity.UNCOMMON, mage.cards.s.StatusStatue.class));
        cards.add(new SetCardInfo("Steam Vents", 257, Rarity.RARE, mage.cards.s.SteamVents.class));
        cards.add(new SetCardInfo("Sumala Woodshaper", 200, Rarity.COMMON, mage.cards.s.SumalaWoodshaper.class));
        cards.add(new SetCardInfo("Sunhome Stalwart", 26, Rarity.UNCOMMON, mage.cards.s.SunhomeStalwart.class));
        cards.add(new SetCardInfo("Swamp", 262, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Temple Garden", 258, Rarity.RARE, mage.cards.t.TempleGarden.class));
        cards.add(new SetCardInfo("Thought Erasure", 206, Rarity.UNCOMMON, mage.cards.t.ThoughtErasure.class));
        cards.add(new SetCardInfo("Underrealm Lich", 211, Rarity.MYTHIC, mage.cards.u.UnderrealmLich.class));
        cards.add(new SetCardInfo("Unexplained Disappearance", 56, Rarity.COMMON, mage.cards.u.UnexplainedDisappearance.class));
        cards.add(new SetCardInfo("Vraska's Stoneglare", 272, Rarity.RARE, mage.cards.v.VraskasStoneglare.class));
        cards.add(new SetCardInfo("Vraska, Regal Gorgon", 269, Rarity.MYTHIC, mage.cards.v.VraskaRegalGorgon.class));
        cards.add(new SetCardInfo("Wary Okapi", 149, Rarity.COMMON, mage.cards.w.WaryOkapi.class));
        cards.add(new SetCardInfo("Watery Grave", 259, Rarity.RARE, mage.cards.w.WateryGrave.class));
        cards.add(new SetCardInfo("Whisper Agent", 220, Rarity.COMMON, mage.cards.w.WhisperAgent.class));
    }
}
