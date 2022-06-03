-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`cliente` (
  `idcliente` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(50) NOT NULL,
  `Direccion` VARCHAR(100) NOT NULL,
  `Telefono` VARCHAR(45) NULL,
  `Descripcion` VARCHAR(100) NULL,
  PRIMARY KEY (`idcliente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`venta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`venta` (
  `idventa` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `Fecha` DATETIME NOT NULL,
  `Observacion` VARCHAR(100) NULL,
  `cliente_idcliente` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`idventa`),
  INDEX `fk_venta_cliente_idx` (`cliente_idcliente` ASC) VISIBLE,
  CONSTRAINT `fk_venta_cliente`
    FOREIGN KEY (`cliente_idcliente`)
    REFERENCES `mydb`.`cliente` (`idcliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`producto` (
  `idproducto` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `PrecioUnitario` DECIMAL(10,2) NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Descripcion` VARCHAR(45) NULL,
  `Observaciones` VARCHAR(45) NULL,
  PRIMARY KEY (`idproducto`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`detalle_venta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`detalle_venta` (
  `iddetalle_venta` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `Cantidad` INT NOT NULL DEFAULT 1,
  `PrecioUnitario` DECIMAL(10,2) NOT NULL,
  `venta_idventa` INT UNSIGNED NOT NULL,
  `producto_idproducto` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`iddetalle_venta`),
  INDEX `fk_detalle_venta_venta1_idx` (`venta_idventa` ASC) VISIBLE,
  INDEX `fk_detalle_venta_producto1_idx` (`producto_idproducto` ASC) VISIBLE,
  CONSTRAINT `fk_detalle_venta_venta1`
    FOREIGN KEY (`venta_idventa`)
    REFERENCES `mydb`.`venta` (`idventa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_detalle_venta_producto1`
    FOREIGN KEY (`producto_idproducto`)
    REFERENCES `mydb`.`producto` (`idproducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
