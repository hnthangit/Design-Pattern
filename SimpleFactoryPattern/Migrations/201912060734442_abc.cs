namespace SimpleFactoryPattern.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class abc : DbMigration
    {
        public override void Up()
        {
            AddColumn("dbo.SinhViens", "BirthDay", c => c.DateTime(nullable: false));
            AddColumn("dbo.SinhViens", "Gender", c => c.Int(nullable: false));
        }
        
        public override void Down()
        {
            DropColumn("dbo.SinhViens", "Gender");
            DropColumn("dbo.SinhViens", "BirthDay");
        }
    }
}
