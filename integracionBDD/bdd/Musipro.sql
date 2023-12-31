-- MySQL Script generated by MySQL Workbench
-- Tue Jun 13 20:16:06 2023
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema cl.musicpro
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema cl.musicpro
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `cl.musicpro` DEFAULT CHARACTER SET utf8 ;
USE `cl.musicpro` ;

-- -----------------------------------------------------
-- Table `cl.musicpro`.`categoria`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cl.musicpro`.`categoria` ;

CREATE TABLE IF NOT EXISTS `cl.musicpro`.`categoria` (
  `idcategoria` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  PRIMARY KEY (`idcategoria`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cl.musicpro`.`productos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cl.musicpro`.`productos` ;

CREATE TABLE IF NOT EXISTS `cl.musicpro`.`productos` (
  `idproductos` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NULL,
  `modelo` VARCHAR(45) NULL,
  `precio` INT NULL,
  `nombre` VARCHAR(45) NULL,
  `sku` VARCHAR(45) NULL,
  `categoria_idcategoria` INT NOT NULL,
  PRIMARY KEY (`idproductos`, `categoria_idcategoria`),
  INDEX `fk_productos_categoria_idx` (`categoria_idcategoria` ASC) VISIBLE,
  CONSTRAINT `fk_productos_categoria`
    FOREIGN KEY (`categoria_idcategoria`)
    REFERENCES `cl.musicpro`.`categoria` (`idcategoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
