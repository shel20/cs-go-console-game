package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("You are playing a cs:go match as a counter-terrorist. The score is 14-14,the map is dust2 and you've got 6500$. What would you buy?");
        System.out.println("Option 1: Awp, kevlar+helmet, smoke, 2flashes");
        System.out.println("Option 2: Awp, kevlar, smoke, molly, flash");
        System.out.println("Option 3: M4A4, kevlar+helmet, smoke, molly, 2flashes");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        System.out.println("---------------------------------------------------------------------------------------------------------");
        switch (answer) {

            case "1":
                System.out.println("After you have bought, you see that you've got a spawn for B site, where do you want to go?");
                System.out.println("Option 1: B site");
                System.out.println("Option 2: We need to take long");
                System.out.println("Option 3: I will push mid to lower tunnel");
                answer = sc.nextLine();
                System.out.println("---------------------------------------------------------------------------------------------------------");
                switch (answer) {
                    case "1":
                        System.out.println("What do you want to do first?");
                        System.out.println("Option 1: Peek mid to have info about enemy");
                        System.out.println("Option 2: Just run to be there first");
                        System.out.println("Option 3: Throw a cross smoke");
                        answer = sc.nextLine();
                        System.out.println("---------------------------------------------------------------------------------------------------------");
                        switch (answer) {
                            case "1":
                                System.out.println("You got deleted. The awp was already holding you.");
                                System.out.println("Your team is swearing you and blaming you for this stupid decision.");
                                break;
                            case "2":
                                System.out.println("You get headshot through the doors." +
                                        " Your teammates are saying that you are too stupid because you didn't smoke the cross.");
                                break;
                            case "3":
                                System.out.println("You threw your smoke and crossed successfully, you are close to b site now. What would you do next?");
                                System.out.println("Option 1: Peek to B tunnels to hold from distance");
                                System.out.println("Option 2: Throw a flash in tunnel");
                                System.out.println("Option 3: Push tunnels because you think they went long");
                                answer = sc.nextLine();
                                System.out.println("---------------------------------------------------------------------------------------------------------");
                                switch (answer) {
                                    case "1":
                                        System.out.println("The terrorists are rushing b with mac10s and destroy your ass.");
                                        System.out.println("You killed 1,but it is noto enough." +
                                                "It looks like you could kill atleast 2 if you had M4");
                                        break;
                                    case "2":
                                        System.out.println("The terrorists are rushing b with mac10s and destroy your ass.");
                                        System.out.println("A molotov could be very usefull in these situations");
                                        break;
                                    case "3":
                                        System.out.println("You face 4 terrorists with smgs. Good night");
                                        System.out.println("Your team is saying that you are an idiot and they are reporting you");
                                        break;
                                }
                                break;
                        }
                        break;
                    case "2":
                        System.out.println("Two teammates are saying that they will fight long.");
                        System.out.println("You know that you don't have the best spawn. What is your next move?");
                        System.out.println("Option 1: Rush long to fight with your team");
                        System.out.println("Option 2: Throw the 2 flashes for your teammates to take long");
                        System.out.println("Option 3: Hide car to make some kills");
                        answer = sc.nextLine();
                        System.out.println("---------------------------------------------------------------------------------------------------------");
                        switch (answer) {
                            case "1":
                                System.out.println("You are rushing long but all you can see it's an white monitor." +
                                        " The enemies threw 6 flashes long and destroyed you all");
                                System.out.println("You lost 16-14");
                                break;
                            case "2":
                                System.out.println("Your teammates caught an enemy off guard and headshoted him.");
                                System.out.println("They are thanking you for the good flashes");
                                System.out.println("Now your team has an advantage, what is the next move?");
                                System.out.println("Option 1:Push long with your teammates to get more kills");
                                System.out.println("Option 2:Stay 3 guys long to hold it");
                                System.out.println("Option 3:Throw your smoke on long doors and hold short from site");
                                answer = sc.nextLine();
                                System.out.println("---------------------------------------------------------------------------------------------------------");
                                switch (answer) {
                                    case "1":
                                        System.out.println("The terrorists are holding long and you all die. You lost 16-14.");
                                        break;
                                    case "2":
                                        System.out.println("The terrorists pushed short and killed you from A site while you were focusing long.");
                                        System.out.println("Your team tries to retake but they lost. You lost 16-14.");
                                        break;
                                    case "3":
                                        System.out.println("The terrorists are pushing short. You kill 2 guys with the awp, but the 3rd guy kills you.");
                                        System.out.println("Your teammates succed to make the 4v2 retake. Congrats, You won 16-14 and You rank up to global elite :D");
                                        break;
                                }
                                break;
                            case "3":
                                System.out.println("Your teammates die on long and asking what the hell are you doing");
                                System.out.println("Terrorists are pushing long. They didn't check you but you manage to kill only 1 from behind.");
                                System.out.println("Your team is losing the 2v4 retake and you lose the game.");
                                break;
                        }
                        break;
                    case "3":
                        System.out.println("The terrorists expect you to be there and kills you." +
                                "Pushing lower with an awp is not the best tactic. You lose 16-14.");
                        break;
                }
                break;

            case "2":
                System.out.println("After you have bought, you see that you've got a spawn for B site, where do you want to go?");
                System.out.println("Option 1: B site");
                System.out.println("Option 2: We need to take long");
                System.out.println("Option 3: I will push mid to lower tunnel");
                answer = sc.nextLine();
                System.out.println("---------------------------------------------------------------------------------------------------------");
                switch (answer) {
                    case "1":
                        System.out.println("What do you want to do first?");
                        System.out.println("Option 1: Peek mid to have info about enemy");
                        System.out.println("Option 2: Just run to be there first");
                        System.out.println("Option 3: Throw a cross smoke");
                        answer = sc.nextLine();
                        System.out.println("---------------------------------------------------------------------------------------------------------");
                        switch (answer) {
                            case "1":
                                System.out.println("You got deleted. The awp was already holding you.");
                                System.out.println("Your team is swearing you and blaming you for this stupid decision.");
                                break;
                            case "2":
                                System.out.println("You get headshot through the doors." +
                                        " Your teammates are saying that you are too stupid because you didn't smoke the cross.");
                                break;
                            case "3":
                                System.out.println("You threw your smoke and crossed successfully, you are close to b site now. What would you do next?");
                                System.out.println("Option 1: Peek to B tunnels to hold from distance");
                                System.out.println("Option 2: Throw a molly in tunnel");
                                System.out.println("Option 3: Push tunnels because you think they went long");
                                answer = sc.nextLine();
                                System.out.println("---------------------------------------------------------------------------------------------------------");
                                switch (answer) {
                                    case "1":
                                        System.out.println("The terrorists are rushing b with mac10s and destroy your ass.");
                                        System.out.println("You manage to kill 1 but it's not enough." +
                                                "It looks like you could kill atleast 2 if you had M4");
                                        break;
                                    case "2":
                                        System.out.println("The terrorists are rushing through your molly." +
                                                "They are burning alive and you manage to make three easy kills, but the 4th guy killed you." +
                                                "Your team succed to make the 4v2 retake and you won the game.");
                                        System.out.println("Congrats! You rankup to the global elite rank !");
                                        break;
                                    case "3":
                                        System.out.println("You face 4 terrorists with smgs. Good night");
                                        System.out.println("Your team is saying that you are an idiot and they are reporting you");
                                        break;
                                }
                                break;
                        }
                        break;
                    case "2":
                        System.out.println("Two teammates are saying that they will fight long.");
                        System.out.println("You know that you don't have the best spawn. What is your next move?");
                        System.out.println("Option 1: Rush long to fight with your team");
                        System.out.println("Option 2: Throw the flash for your teammates to take long");
                        System.out.println("Option 3: Hide car to make some kills");
                        answer = sc.nextLine();
                        System.out.println("---------------------------------------------------------------------------------------------------------");
                        switch (answer) {
                            case "1":
                                System.out.println("You are rushing long but all you can see it's an white monitor." +
                                        " The enemies threw 6 flashes long and destroyed you all");
                                System.out.println("You lost 16-14");
                                break;
                            case "2":
                                System.out.println("You throw your flash,but it's not enough." +
                                        "Your team manage to kill 1 guy, but then they die on long." +
                                        "If you had 2 flashes the round could be yours, but this is not happening." +
                                        "The terrorists got 1 man advantage and they manage to win the round.");
                                break;
                            case "3":
                                System.out.println("Your teammates die on long and asking what the hell are you doing");
                                System.out.println("Terrorists are pushing long. They didn't check you but you manage to kill only 1 from behind.");
                                System.out.println("Your team is losing the 2v4 retake and you lose the game.");
                                break;
                        }
                    case "3":
                        System.out.println("The terrorists expect you to be there and kills you." +
                                "Pushing lower with an awp is not the best tactic. You lose 16-14.");
                        break;
                }
                break;

            case "3":
                System.out.println("After you have bought, you see that you've got a spawn for B site, where do you want to go?");
                System.out.println("Option 1: B site");
                System.out.println("Option 2: We need to take long");
                System.out.println("Option 3: I will push mid to lower tunnel");
                answer = sc.nextLine();
                System.out.println("---------------------------------------------------------------------------------------------------------");
                switch (answer) {
                    case "1":
                        System.out.println("What do you want to do first?");
                        System.out.println("Option 1: Peek mid to have info about enemy");
                        System.out.println("Option 2: Just run to be there first");
                        System.out.println("Option 3: Throw a cross smoke");
                        answer = sc.nextLine();
                        System.out.println("---------------------------------------------------------------------------------------------------------");
                        switch (answer) {
                            case "1":
                                System.out.println("You got deleted. The awp was already holding you.");
                                System.out.println("Your team is swearing you and blaming you for this stupid decision.");
                                break;
                            case "2":
                                System.out.println("You get headshot through the doors." +
                                        " Your teammates are saying that you are too stupid because you didn't smoke the cross.");
                                break;
                            case "3":
                                System.out.println("You threw your smoke and crossed successfully, you are close to b site now. What would you do next?");
                                System.out.println("Option 1: Peek to B tunnels to hold from distance");
                                System.out.println("Option 2: Throw a molly in tunnel");
                                System.out.println("Option 3: Push tunnels because you think they went long");
                                answer = sc.nextLine();
                                System.out.println("---------------------------------------------------------------------------------------------------------");
                                switch (answer) {
                                    case "1":
                                        System.out.println("The terrorists are rushing b with mac10s and destroy your ass." +
                                                "You succed to kill 2 guys atleast. Your team is in advantage but is hard to retake B site." +
                                                "Your team is losing the retake and you lose the game.");
                                        break;
                                    case "2":
                                        System.out.println("The terrorists are rushing through your molly." +
                                                "They are burning alive and you manage to make a beautiful ACE !" +
                                                "Your team said they never saw a better player than you !");
                                        System.out.println("Congrats! You rankup to the global elite!");
                                        break;
                                    case "3":
                                        System.out.println("You face 4 terrorists with smgs. Good night");
                                        System.out.println("Your team is saying that you are an idiot and they are reporting you");
                                        break;
                                }
                                break;
                        }
                        break;
                    case "2":
                        System.out.println("Two teammates are saying that they will fight long.");
                        System.out.println("You know that you don't have the best spawn. What is your next move?");
                        System.out.println("Option 1: Rush long to fight with your team");
                        System.out.println("Option 2: Throw the 2 flashes for your teammates to take long");
                        System.out.println("Option 3: Hide car to make some kills");
                        answer = sc.nextLine();
                        System.out.println("---------------------------------------------------------------------------------------------------------");
                        switch (answer) {
                            case "1":
                                System.out.println("You are rushing long but all you can see it's an white monitor." +
                                        " The enemies threw 6 flashes long and destroyed you all");
                                System.out.println("You lost 16-14");
                                break;
                            case "2":
                                System.out.println("Your teammates caught an enemy off guard and headshoted him.");
                                System.out.println("They are thanking you for the good flashes");
                                System.out.println("Now your team has an advantage, what is the next move?");
                                System.out.println("Option 1:Push long with your teammates to get more kills");
                                System.out.println("Option 2:Stay 3 guys long to hold it");
                                System.out.println("Option 3:Throw your smoke on long doors and hold short from site");
                                answer = sc.nextLine();
                                System.out.println("---------------------------------------------------------------------------------------------------------");
                                switch (answer) {
                                    case "1":
                                        System.out.println("The terrorists are holding long and you all die. You lost 16-14.");
                                        break;
                                    case "2":
                                        System.out.println("The terrorists pushed short and killed you from A site while you were focusing long.");
                                        System.out.println("Your team tries to retake but they lost. You lost 16-14.");
                                        break;
                                    case "3":
                                        System.out.println("The terrorists are pushing short. You kill 2 guys with the awp, but the 3rd guy kills you.");
                                        System.out.println("Your teammates succed to make the 4v2 retake. Congrats, You won 16-14 and You rank up to global elite :D");
                                        break;
                                }
                                break;
                            case "3":
                                System.out.println("Your teammates die on long and asking what the hell are you doing");
                                System.out.println("Terrorists are pushing long. They didn't check you but you manage to kill only 1 from behind.");
                                System.out.println("Your team is losing the 2v4 retake and you lose the game.");
                                break;
                        }
                        break;
                    case "3":
                        System.out.println("The terrorists expect you to be there, but with your godlike aim you kill 2 guys." +
                                "Your team has info that all terrorists are in lower tunnel and make a sandwitch out of them." +
                                "Congrats! You won the round and the game !");
                        break;
                }
                break;
        }



    }
}