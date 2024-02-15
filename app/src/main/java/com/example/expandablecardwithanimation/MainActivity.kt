package com.example.expandablecardwithanimation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.expandablecardwithanimation.ui.theme.ExpandableCardWithAnimationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExpandableCardWithAnimationTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.background)
                        .padding(10.dp),
                ) {
                    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                        ExpandableCard(
                            title = "Brimstone",
                            description = "Joining from the U.S.A., Brimstone's orbital arsenal ensures his squad always has the advantage. His ability to deliver utility precisely and from a distance make him an unmatched boots-on-the-ground commander."
                        )
                        ExpandableCard(
                            title = "Viper",
                            description = "The American chemist, Viper deploys an array of poisonous chemical devices to control the battlefield and choke the enemy's vision. If the toxins don't kill her prey, her mind games surely will."
                        )
                        ExpandableCard(
                            title = "Omen",
                            description = "A phantom of a memory, Omen hunts in the shadows. He renders enemies blind, teleports across the field, then lets paranoia take hold as his foe scrambles to learn where he might strike next."
                        )
                        ExpandableCard(
                            title = "Cypher",
                            description = "The Moroccan information broker, Cypher is a one-man surveillance network who keeps tabs on the enemy’s every move. No secret is safe. No maneuver goes unseen. Cypher is always watching."
                        )
                        ExpandableCard(
                            title = "Sova",
                            description = "Born from the eternal winter of Russia's tundra, Sova tracks, finds, and eliminates enemies with ruthless efficiency and precision. His custom bow and incredible scouting abilities ensure that even if you run, you cannot hide."
                        )
                        ExpandableCard(
                            title = "Sage",
                            description = "The bastion of China, Sage creates safety for herself and her team wherever she goes. Able to revive fallen friends and stave off aggressive pushes, she provides a calm center to a hellish fight."
                        )
                        ExpandableCard(
                            title = "Phoenix",
                            description = "Hailing from the U.K., Phoenix's star power shines through in his fighting style, igniting the battlefield with flash and flare. Whether he's got backup or not, he'll rush into a fight on his own terms."
                        )
                        ExpandableCard(
                            title = "Jett",
                            description = "Representing her home country of South Korea, Jett's agile and evasive fighting style lets her take risks no one else can. She runs circles around every skirmish, cutting enemies before they even know what hit them."
                        )
                        ExpandableCard(
                            title = "Raze",
                            description = "Raze explodes out of Brazil with her big personality and big guns. With her blunt-force-trauma playstyle, she excels at flushing entrenched enemies and clearing tight spaces with a generous dose of “boom.”"
                        )
                        ExpandableCard(
                            title = "Breach",
                            description = "Breach, the bionic Swede, fires powerful, targeted kinetic blasts to aggressively clear a path through enemy ground. The damage and disruption he inflicts ensures no fight is ever fair."
                        )
                        ExpandableCard(
                            title = "Reyna",
                            description = "Forged in the heart of Mexico, Reyna dominates single combat, popping off with each kill she scores. Her capability is only limited by her raw skill, making her highly dependent on performance."
                        )
                        ExpandableCard(
                            title = "Killjoy",
                            description = "The genius of Germany, Killjoy effortlessly secures key battlefield positions with her arsenal of inventions. If their damage doesn't take her enemies out, the debuff her robots provide will make short work of them."
                        )
                        ExpandableCard(
                            title = "Skye",
                            description = "Hailing from Australia, Skye and her band of beasts trail-blaze the way through hostile territory. With her creations hampering the enemy, and her power to heal others, the team is strongest and safest by Skye's side."
                        )
                        ExpandableCard(
                            title = "Yoru",
                            description = "Japanese native Yoru rips holes straight through reality to infiltrate enemy lines unseen. Using deception and aggression in equal measure, he gets the drop on each target before they know where to look."
                        )
                        ExpandableCard(
                            title = "Astra",
                            description = "Ghanaian Agent Astra harnesses the energies of the cosmos to reshape battlefields to her whim. With full command of her astral form and a talent for deep strategic foresight, she’s always eons ahead of her enemy’s next move."
                        )
                        ExpandableCard(
                            title = "KAY/O",
                            description = "KAY/O is a machine of war built for a single purpose: neutralizing radiants. His power to suppress enemy abilities dismantles his opponents' capacity to fight back, securing him and his allies the ultimate edge."
                        )
                        ExpandableCard(
                            title = "Chamber",
                            description = "Well-dressed and well-armed, French weapons designer Chamber expels aggressors with deadly precision. He leverages his custom arsenal to hold the line and pick off enemies from afar, with a contingency built for every plan."
                        )
                        ExpandableCard(
                            title = "Neon",
                            description = "Filipino Agent, Neon, surges forward at shocking speeds, discharging bursts of bioelectric radiance as fast as her body generates it. She races ahead to catch enemies off guard, then strikes them down quicker than lightning."
                        )
                        ExpandableCard(
                            title = "Fade",
                            description = "Turkish bounty hunter Fade unleashes the power of raw nightmare to seize enemy secrets. Attuned with terror itself, she hunts down targets and reveals their deepest fears - before crushing them in the dark."
                        )
                        ExpandableCard(
                            title = "Harbor",
                            description = "Hailing from India's coast, Harbor storms the field wielding ancient technology with dominion over water. He unleashes frothing rapids and crushing waves to shield his allies, or pummel those that oppose him."
                        )
                        ExpandableCard(
                            title = "Gekko",
                            description = "Gekko the Angeleno leads a tight-knit crew of calamitous creatures. His buddies bound forward, scattering enemies out of the way, with Gekko chasing them down to regroup and go again."
                        )
                        ExpandableCard(
                            title = "Deadlock",
                            description = "Norwegian operative Deadlock deploys an array of cutting-edge nanowire to secure the battlefield from even the most lethal assault. No one escapes her vigilant watch, nor survives her unyielding ferocity."
                        )
                        ExpandableCard(
                            title = "Iso",
                            description = "Chinese fixer for hire Iso goes into a flow state to dismantle the opposition. Reconfiguring ambient energy into bulletproof protection, he advances with focus towards his next duel to the death."
                        )
                    }
                }
            }
        }
    }
}