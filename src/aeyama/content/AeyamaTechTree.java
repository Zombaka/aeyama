package aeyama.content;

import arc.struct.*;

import mindustry.game.Objectives.*;

import aeyama.content.blocks.*;

import static mindustry.content.TechTree.*;
import static mindustry.type.ItemStack.*;

public class AeyamaTechTree {
    
    public static void load() {
        AeyamaPlanets.aeyama.techTree = nodeRoot("Aeyama", AeyamaItems.planet, () -> {
            node(AeyamaStorageBlocks.coreDropPod, () -> {
                node(AeyamaDistributionBlocks.woodConveyor, with(AeyamaItems.woodLumber, 10, AeyamaItems.stone, 5), Seq.with(new Research(AeyamaProductionBlocks.woodHarvester)), () -> {
                    node(AeyamaDistributionBlocks.ironConveyor, with(/*TODO*/), Seq.with(new Produce(AeyamaItems.iron)), () -> {
                        node(AeyamaDistributionBlocks.steelConveyor, with(/*TODO*/), Seq.with(new Produce(AeyamaItems.iron), new Produce(AeyamaItems.steel)), () -> {

                        });
                        node(AeyamaDistributionBlocks.ironRouter, with(/*TODO*/), Seq.with(new Produce(AeyamaItems.iron)), () -> {
                            node(AeyamaDistributionBlocks.ironJunction, with(/*TODO*/), Seq.with(new Produce(AeyamaItems.iron)), () -> {

                            });
                            node(AeyamaDistributionBlocks.ironBridge, with(/*TODO*/), Seq.with(new Produce(AeyamaItems.iron)), () -> {

                            });
                        });
                    });
                    node(AeyamaDistributionBlocks.woodRouter, with(AeyamaItems.woodLumber, 20, AeyamaItems.stone, 10), () -> {

                    });
                    node(AeyamaDistributionBlocks.woodJunction, with(AeyamaItems.woodLumber, 50, AeyamaItems.stone, 10), Seq.with(new SectorComplete(AeyamaSectors.newWorld)), () -> {

                    });
                });
                node(AeyamaStorageBlocks.coreFrontline, with(AeyamaItems.woodLumber, 600, AeyamaItems.stoneBrick, 950, AeyamaItems.rawIron, 250, AeyamaItems.blueprint, 2), Seq.with(new Produce(AeyamaItems.blueprint)/*, new Produce(AeyamaUnitTypes.sms)*/), () -> {
                    node(AeyamaStorageBlocks.coreControl, with(AeyamaItems.woodLumber, 1000, AeyamaItems.stoneBrick, 1000, AeyamaItems.iron, 500, AeyamaItems.specialBPDefense, 3), () -> {

                    });
                    node(AeyamaStorageBlocks.groundScanner, with(AeyamaItems.stoneBrick, 450, AeyamaItems.iron, 200, AeyamaItems.blueprint, 2), Seq.with(new Produce(AeyamaItems.iron)), () -> {

                    });
                });
                node(AeyamaProductionBlocks.woodHarvester, with(AeyamaItems.woodLumber, 80), () -> {
                    node(AeyamaProductionBlocks.stoneMiner, with(AeyamaItems.woodLumber, 120), () -> {
                        node(AeyamaProductionBlocks.ironMiner, with(AeyamaItems.woodLumber, 110, AeyamaItems.stoneBrick, 185), () -> {
                            
                        });
                        node(AeyamaProductionBlocks.copperMiner, with(AeyamaItems.woodLumber, 210, AeyamaItems.stoneBrick, 270, AeyamaItems.iron, 45, AeyamaItems.blueprint, 2), () -> {
                            
                        });
                        node(AeyamaProductionBlocks.zincMiner, with(AeyamaItems.woodLumber, 210, AeyamaItems.stoneBrick, 270, AeyamaItems.iron, 45, AeyamaItems.blueprint, 2), () -> {
                            
                        });
                    });
                });
                node(AeyamaStorageBlocks.smallStockpile, with(AeyamaItems.woodLumber, 120, AeyamaItems.stoneBrick, 300, AeyamaItems.blueprint, 1), Seq.with(new Produce(AeyamaItems.rawIron)), () -> {
                    node(AeyamaStorageBlocks.stockpile, with(AeyamaItems.woodLumber, 1200, AeyamaItems.stoneBrick, 1800, AeyamaItems.iron, 600, AeyamaItems.blueprint, 12), () -> {
                        node(AeyamaStorageBlocks.largeStockpile, with(AeyamaItems.woodLumber, 3750, AeyamaItems.stoneBrick, 4500, AeyamaItems.iron, 1000, AeyamaItems.advancedBlueprint, 18), () -> {
                            
                        });
                    });
                });
                node(AeyamaProductionBlocks.brickMaker, with(AeyamaItems.woodLumber, 300, AeyamaItems.stone, 200), Seq.with(new Produce(AeyamaItems.woodLumber), new Produce(AeyamaItems.stone)), () -> {
                    node(AeyamaProductionBlocks.researchStation, with(AeyamaItems.woodLumber, 400, AeyamaItems.stoneBrick, 600, AeyamaItems.rawIron, 250), Seq.with(new Produce(AeyamaItems.woodLumber), new Produce(AeyamaItems.stoneBrick), new Produce(AeyamaItems.rawIron)), () -> {
                        node(AeyamaProductionBlocks.woodDryer, with(AeyamaItems.woodLumber, 300, AeyamaItems.stoneBrick, 150, AeyamaItems.blueprint, 1), () -> {
                            node(AeyamaProductionBlocks.shredder, with(AeyamaItems.woodLumber, 500, AeyamaItems.stoneBrick, 200, AeyamaItems.rawIron, 140), Seq.with(new Produce(AeyamaItems.woodLumber), new Produce(AeyamaItems.stoneBrick), new Produce(AeyamaItems.rawIron), new SectorComplete(AeyamaSectors.newWorld)), () -> {
    
                            });
                        });
                        node(AeyamaProductionBlocks.burner, with(AeyamaItems.woodLumber, 150, AeyamaItems.stoneBrick, 375, AeyamaItems.rawIron, 75, AeyamaItems.blueprint, 2), () -> {
                            node(AeyamaProductionBlocks.oreSmelter, with(AeyamaItems.woodLumber, 450, AeyamaItems.stoneBrick, 650, AeyamaItems.rawIron, 300, AeyamaItems.blueprint, 2), () -> {
                                node(AeyamaProductionBlocks.oreFoundry, with(AeyamaItems.iron, 280, AeyamaItems.woodLumber, 725, AeyamaItems.stoneBrick, 800, AeyamaItems.blueprint, 4), () -> {
    
                                });
                            });
                        });
                        node(AeyamaProductionBlocks.researchLab, with(AeyamaItems.woodLumber, 800, AeyamaItems.stoneBrick, 1200, AeyamaItems.rawIron, 500, AeyamaItems.blueprint, 10), () -> {

                        });
                    });
                });
                node(AeyamaDefenseBlocks.thrower, with(AeyamaItems.woodLumber, 100, AeyamaItems.stoneBrick, 130, AeyamaItems.iron, 20, AeyamaItems.blueprint, 2), Seq.with(new Produce(AeyamaItems.blueprint), new SectorComplete(AeyamaSectors.newWorld)), () -> {
                    node(AeyamaDefenseBlocks.bully, with(AeyamaItems.woodLumber, 165, AeyamaItems.stone, 195, AeyamaItems.iron, 45, AeyamaItems.blueprint, 2), Seq.with(new SectorComplete(AeyamaSectors.newWorld)), () -> {
    
                    });
                    node(AeyamaDefenseBlocks.craker, with(/*TODO*/), Seq.with(new Produce(AeyamaItems.steel), new Produce(AeyamaItems.advancedBlueprint)), () -> {
                        node(AeyamaDefenseBlocks.penetration, with(), Seq.with(new SectorComplete(AeyamaSectors.encounter)), () -> {

                        });
                    });
                    node(AeyamaDefenseBlocks.woodWall, with(AeyamaItems.woodLumber, 20), Seq.with(new Produce(AeyamaItems.woodLumber), new SectorComplete(AeyamaSectors.newWorld)), () -> {
                        node(AeyamaDefenseBlocks.stoneBrickWall, with(AeyamaItems.stoneBrick, 20), Seq.with(new Produce(AeyamaItems.stoneBrick), new SectorComplete(AeyamaSectors.newWorld)), () -> {
                            node(AeyamaDefenseBlocks.ironWall, with(AeyamaItems.iron, 20), Seq.with(new Produce(AeyamaItems.iron), new SectorComplete(AeyamaSectors.encounter)), () -> {
                                node(AeyamaDefenseBlocks.steelWall, with(AeyamaItems.steel, 20), Seq.with(new Produce(AeyamaItems.steel)), () -> {
                                    node(AeyamaDefenseBlocks.largeSteelWall, with(AeyamaItems.steel, 100), () -> {
                                        
                                    });
                                });
                                node(AeyamaDefenseBlocks.largeIronWall, with(AeyamaItems.iron, 100), () -> {
                                    
                                });
                            });
                            node(AeyamaDefenseBlocks.largeStoneBrickWall, with(AeyamaItems.stoneBrick, 100), () -> {
                                
                            });
                        });
                        node(AeyamaDefenseBlocks.largeWoodWall, with(AeyamaItems.woodLumber, 100), () -> {
                            
                        });
                    });
                });
            });

            nodeProduce(AeyamaItems.woodLumber, () -> {
                nodeProduce(AeyamaItems.blueprint, () -> {
                    nodeProduce(AeyamaItems.advancedBlueprint, () -> {
                        nodeProduce(AeyamaItems.specialBPDefense, () -> {
                            
                        });
                        nodeProduce(AeyamaItems.specialBPOffense, () -> {
                            
                        });
                    });
                });
                nodeProduce(AeyamaItems.carbon, () -> {

                });
                nodeProduce(AeyamaItems.sand, () -> {
                    nodeProduce(AeyamaLiquids.water, () -> {

                    });
                });
                nodeProduce(AeyamaItems.stone, () -> {
                    nodeProduce(AeyamaItems.rawIron, () -> {
                        nodeProduce(AeyamaItems.iron, () -> {
                            nodeProduce(AeyamaItems.steel, () -> {
                                nodeProduce(AeyamaItems.armorPlating, () -> {

                                });
                            });
                        });
                        nodeProduce(AeyamaItems.rawCopper, () -> {
                            nodeProduce(AeyamaItems.copper, () -> {
                                nodeProduce(AeyamaItems.brass, Seq.with(new Produce(AeyamaItems.zinc), new Produce(AeyamaItems.copper)),  () -> {
                                    nodeProduce(AeyamaItems.rifle, Seq.with(new Research(AeyamaProductionBlocks.ammunitionPress)), () -> {
                                        nodeProduce(AeyamaItems.combustibleCanister, Seq.with(new Produce(AeyamaItems.carbon)), () -> {
                                            nodeProduce(AeyamaItems.rocket, () -> {
                                                
                                            });
                                        });
                                        nodeProduce(AeyamaItems.highCaliber, () -> {

                                        });
                                        nodeProduce(AeyamaItems.shotgunShell, () -> {
                                            nodeProduce(AeyamaItems.shotgunSlug, () -> {
    
                                            });
                                        });
                                    });
                                });
                            });
                            nodeProduce(AeyamaItems.rawTin, () -> {
                                nodeProduce(AeyamaItems.tin, () -> {
                                    nodeProduce(AeyamaItems.bronze, () -> {
        
                                    });
                                });
                            });
                        });
                        nodeProduce(AeyamaItems.rawTitanium, () -> {
                            nodeProduce(AeyamaItems.titanium, () -> {
                                
                            });
                        });
                        nodeProduce(AeyamaItems.rawZinc, () -> {
                            nodeProduce(AeyamaItems.rawAluminum, () -> {
                                nodeProduce(AeyamaItems.aluminum, () -> {
                                    
                                });
                            });
                            nodeProduce(AeyamaItems.zinc, () -> {
                                
                            });
                        });
                    });
                    nodeProduce(AeyamaItems.stonePebbles, () -> {
                        
                    });
                    nodeProduce(AeyamaItems.stoneBrick, () -> {

                    });
                });
                nodeProduce(AeyamaItems.woodLumberDry, () -> {

                });
                nodeProduce(AeyamaItems.woodShreds, () -> {
                    
                });
            });

            node(AeyamaSectors.newWorld, () -> {
                node(AeyamaSectors.encounter, Seq.with(new SectorComplete(AeyamaSectors.newWorld)), () -> {
    
                });
            });

            node(AeyamaUnits.colonist, () -> {
                node(AeyamaUnits.sms, with(AeyamaItems.armorPlating, 100), () -> {
                    node(AeyamaUnits.assault, with(AeyamaItems.armorPlating, 200), () -> {
    
                    });
                    node(AeyamaUnits.heavy, with(AeyamaItems.armorPlating, 500), () -> {
    
                    });
                });
            });
        });
    }
}
